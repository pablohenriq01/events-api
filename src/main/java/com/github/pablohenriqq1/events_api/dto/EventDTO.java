package com.github.pablohenriqq1.events_api.dto;

import com.github.pablohenriqq1.events_api.models.Address;
import com.github.pablohenriqq1.events_api.models.Coupon;

import java.util.Date;
import java.util.UUID;

public record EventDTO(String name,
                       Date date,
                       AddressDTO address,
                       CouponDTO coupon,
                       Boolean activate) {
}
