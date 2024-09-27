package com.github.pablohenriqq1.events_api.models;



import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_coupons")
public class Coupons {
    private UUID id;
    private String name;
    private double discount;
    @JoinColumn(name = "fk_event")
    @ManyToOne
    private Event event;

}
