package com.github.pablohenriqq1.events_api.controllers;

import com.github.pablohenriqq1.events_api.dto.AddressDTO;
import com.github.pablohenriqq1.events_api.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping
    public ResponseEntity<Void> createAddress(@RequestBody AddressDTO addressDTO){
        addressService.registerAddress(addressDTO);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
