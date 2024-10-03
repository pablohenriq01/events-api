package com.github.pablohenriqq1.events_api.dto;

import com.github.pablohenriqq1.events_api.models.Event;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.UUID;

public record CouponDTO( String code,
                         double discount,
                         UUID eventId) {
}
