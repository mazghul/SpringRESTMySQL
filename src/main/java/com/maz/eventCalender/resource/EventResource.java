package com.maz.eventCalender.resource;

import com.maz.eventCalender.model.Event;
import com.maz.eventCalender.model.LoadEventResponse;
import com.maz.eventCalender.repository.EventRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/aara/event")
public class EventResource {

    @Autowired
    EventRepository eventRepository;

    @GetMapping(value = "/all")
    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    @PostMapping(value = "/load")
    public LoadEventResponse persist(@RequestBody final Event event) {
        Event event1 = eventRepository.save(event);
        LoadEventResponse loadEventResponse = new LoadEventResponse();
        try{
            if(event1 != null && event1.getId() >0 ){

                loadEventResponse.setResponseCode("200");
                loadEventResponse.setMessage("Event Added Sucessfully");
                loadEventResponse.setResponse(eventRepository.findAll());
            }
        } catch (Exception e){
            loadEventResponse.setResponseCode("400");
            loadEventResponse.setMessage("Error in Adding Event");
        }
        return loadEventResponse;
    }

    @GetMapping(value = "/{toEmailId}")
    public List<Event> getData(@PathVariable String toEmailId) {
        return eventRepository.findByEmail(toEmailId);
    }


    /*@GetMapping(value = "/getEvents/{startDate}/{endDate}")
    public List<Event> getEventsByPeriod(@PathVariable String startDate, @PathVariable String endDate) {
        return eventRepository.getEventsByPeriod(startDate, endDate);
    }*/

}
