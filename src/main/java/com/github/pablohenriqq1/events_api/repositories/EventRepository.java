package com.github.pablohenriqq1.events_api.repositories;

import com.github.pablohenriqq1.events_api.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EventRepository extends JpaRepository<Event, UUID> {
    @Query("SELECT p FROM Event p WHERE p.name =:name ")
    List<Event> findByName(String name);
}
