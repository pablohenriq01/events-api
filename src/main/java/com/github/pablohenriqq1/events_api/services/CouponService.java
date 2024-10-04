package com.github.pablohenriqq1.events_api.services;

import com.github.pablohenriqq1.events_api.dto.CouponDTO;
import com.github.pablohenriqq1.events_api.models.Coupon;
import com.github.pablohenriqq1.events_api.models.Event;
import com.github.pablohenriqq1.events_api.repositories.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CouponService {

    @Autowired
    private CouponRepository couponRepository;
    @Autowired
    private EventService eventService;

    public void registerCoupon(CouponDTO couponDTO){
        Coupon coupon = new Coupon();
        coupon.setCode(couponDTO.code());
        coupon.setDiscount(couponDTO.discount());
        Event eventId = eventService.findByID(couponDTO.eventId());
        coupon.setEvent(eventId);

        couponRepository.save(coupon);
    }
}
