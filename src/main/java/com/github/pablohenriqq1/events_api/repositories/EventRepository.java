package com.github.pablohenriqq1.events_api.repositories;

import com.github.pablohenriqq1.events_api.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
