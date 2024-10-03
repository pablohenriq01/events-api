package com.github.pablohenriqq1.events_api.repositories;

import com.github.pablohenriqq1.events_api.models.Address;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Id> {
}
