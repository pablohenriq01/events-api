package com.github.pablohenriqq1.events_api.dto;

import java.time.LocalDate;

public record EventDTO(String name,
                       LocalDate date) {
}
