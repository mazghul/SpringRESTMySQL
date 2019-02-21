package com.maz.eventCalender.resource;

import com.maz.eventCalender.model.Event;
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
    public List<Event> persist(@RequestBody final Event event) {
        eventRepository.save(event);
        return eventRepository.findAll();
    }

    @GetMapping(value = "/{toEmailId}")
    public List<Event> getData(@PathVariable String toEmailId) {

        return eventRepository.findByToEmailId(toEmailId);
    }

}
