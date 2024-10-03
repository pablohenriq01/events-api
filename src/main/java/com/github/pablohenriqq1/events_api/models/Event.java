package com.github.pablohenriqq1.events_api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private Date date;
    @JoinColumn(name = "fk_event")
    @ManyToOne
    private Address address;
    @JoinColumn(name = "id_coupon")
    @OneToOne
    private Coupon Coupon;
    private Boolean activate;
}
