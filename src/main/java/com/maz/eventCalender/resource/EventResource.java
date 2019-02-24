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

    @GetMapping("findByEmail/{toEmailId:.+}")
    public LoadEventResponse getData(@PathVariable(value = "toEmailId") String toEmailId){
        LoadEventResponse loadEventResponse = new LoadEventResponse();

        try {
            //System.out.println(toEmailId);
            List<Event> events = eventRepository.findByToEmail(toEmailId);
            loadEventResponse.setResponseCode("200");
            loadEventResponse.setMessage("Events Listed Sucessfully");
            loadEventResponse.setResponse(events);
        } catch(Exception e) {
            loadEventResponse.setResponseCode("400");
            loadEventResponse.setMessage("Error in Adding Event");
        }
        return loadEventResponse;
    }

    @GetMapping(value="/getEventsByPeriod")
    @ResponseBody
    public LoadEventResponse getEventsByPeriod(@RequestParam("startDate") String startDate, @RequestParam("endDate") String endDate){
        LoadEventResponse loadEventResponse = new LoadEventResponse();
        //System.out.println(startDate+" " + endDate);
        List<Event> events = eventRepository.getEventsByPeriod(startDate, endDate);
        loadEventResponse.setResponseCode("200");
        loadEventResponse.setMessage("Events Listed Sucessfully");
        loadEventResponse.setResponse(events);
        return loadEventResponse;
    }
}
