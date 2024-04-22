package com.carrental.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="DRIVER_DTLS")
public class Driver
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String driverId;

    @Column(name="DRIVER_IMG")
    private String driverImg;

    @Column(name="DRIVER_NAME")
    private String driverName;

    @Column(name="DRIVER_EXPERIENCE")
    private String driverExperiance;

    @Column(name="DRIVER_MOB_NO")
    private String driverMobNo;

    @Column(name="AVAILABILITY")
    private String availability;

    @Column(name="FOOD")
    private String food;

    @Column(name = "SMOKE")
    private String smoke;

    @Column(name="DRINK")
    private String drink;

    @Column(name = "CHARGES")
    private Double charges;

//    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
//    private List<AtmPage> atmPages;
}
