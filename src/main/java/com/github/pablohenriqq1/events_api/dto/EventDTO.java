package com.github.pablohenriqq1.events_api.dto;

public record EventDTO(String name,
                       AddressDTO address,
                       CouponDTO coupon) {
}
