package com.github.pablohenriqq1.events_api.controllers;

import com.github.pablohenriqq1.events_api.dto.EventDTO;
import com.github.pablohenriqq1.events_api.services.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<Void> createEvent(@Valid @RequestBody EventDTO eventDTO){
        eventService.registerEvent(eventDTO);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
