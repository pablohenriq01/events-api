package com.github.pablohenriqq1.events_api.controllers;

import com.github.pablohenriqq1.events_api.dto.CouponDTO;
import com.github.pablohenriqq1.events_api.services.CouponService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @PostMapping
    public ResponseEntity<Void> createCoupon(@Valid @RequestBody CouponDTO couponDTO){
        couponService.registerCoupon(couponDTO);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
