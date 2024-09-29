package com.github.pablohenriqq1.events_api.repositories;

import com.github.pablohenriqq1.events_api.models.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, UUID> {
}
