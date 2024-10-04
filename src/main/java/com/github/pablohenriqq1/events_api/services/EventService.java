package com.github.pablohenriqq1.events_api.services;

import com.github.pablohenriqq1.events_api.dto.EventDTO;
import com.github.pablohenriqq1.events_api.models.Event;
import com.github.pablohenriqq1.events_api.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;


@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public void registerEvent(EventDTO eventDTO){
        Event event = new Event();
        event.setName(eventDTO.name());
        event.setDate(LocalDate.now());
        event.setCoupon(null);
        event.setActivate(true);

        eventRepository.save(event);
    }

    public Event findByID(UUID uuid){
        return eventRepository.findById(uuid).get();
    }
}
