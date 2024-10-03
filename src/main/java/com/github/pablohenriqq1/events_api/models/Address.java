package com.github.pablohenriqq1.events_api.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Id id;
    private String uf;
    private String city;
    private String street;
}
