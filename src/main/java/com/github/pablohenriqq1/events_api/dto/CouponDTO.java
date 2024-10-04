package com.github.pablohenriqq1.events_api.dto;

import java.util.UUID;

public record CouponDTO( String code,
                         double discount,
                         UUID eventId) {
}
