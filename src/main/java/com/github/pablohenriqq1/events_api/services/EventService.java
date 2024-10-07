package com.github.pablohenriqq1.events_api.services;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.github.pablohenriqq1.events_api.dto.EventDTO;
import com.github.pablohenriqq1.events_api.models.Event;
import com.github.pablohenriqq1.events_api.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;


@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public void registerEvent(EventDTO eventDTO){
        Event event = new Event();
        event.setName(eventDTO.name());
        event.setDate(eventDTO.date());
        event.setCoupon(null);
        event.setAddress(null);
        event.setActivate(true);

        eventRepository.save(event);
    }

    public Event findByID(UUID uuid){
        return eventRepository.findById(uuid).get();
    }

    public List<Event> findByName(String name) {
        return eventRepository.findByName(name);
    }

    public List<Event> getAllEvents (){
        return eventRepository.findAll();
    }



}
