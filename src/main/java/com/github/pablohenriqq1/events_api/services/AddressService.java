package com.github.pablohenriqq1.events_api.services;

import com.github.pablohenriqq1.events_api.dto.AddressDTO;
import com.github.pablohenriqq1.events_api.models.Address;
import com.github.pablohenriqq1.events_api.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public void registerAddress(AddressDTO addressDTO){
        Address address = new Address();
        address.setUf(addressDTO.uf());
        address.setCity(addressDTO.city());
        address.setStreet(addressDTO.street());
        address.setPostalCode(addressDTO.postalCode());
        
        addressRepository.save(address);
    }

}
