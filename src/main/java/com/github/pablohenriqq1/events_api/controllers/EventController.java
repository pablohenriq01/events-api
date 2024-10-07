package com.github.pablohenriqq1.events_api.controllers;

import com.github.pablohenriqq1.events_api.dto.EventDTO;
import com.github.pablohenriqq1.events_api.models.Event;
import com.github.pablohenriqq1.events_api.services.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<EventDTO> createEvent(@Valid @RequestBody EventDTO eventDTO){
        eventService.registerEvent(eventDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(eventDTO);
    }

    @GetMapping
    public ResponseEntity<List<Event>> getAllEvent(){
     List<Event> events = eventService.getAllEvents();
        return ResponseEntity.ok(events);
    }

}
