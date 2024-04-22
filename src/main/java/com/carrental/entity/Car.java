package com.carrental.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="CAR_DTLS")
public class Car
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name="CAR_COMPANY")
    private String carCompany;

    @Column(name="CAR_COLOUR")
    private String carColor;

    @Column(name="CAR_MODEL")
    private String carModel;

    @Column(name="CAR_TYPE")
    private String carType;

    @Column(name="CAR_IMAGE")
    private String carImg;

    @Column(name="CAR_360VIEW")
    private String car360;

    @Column(name="CAR_OWNER")
    private String carOwner;

    @Column(name="NUMBER_PLATE")
    private String numPlate;


    @Column(name="REGISTRATION_DATE")
    private LocalDate regDate;

    @Column(name="INSURANCE")
    private String insurance;

    @Column(name="INSURANCE_VALIDITY")
    private LocalDate insuranceValidity;

    @Column(name="PASSANGER_CAPACITY")
    private Integer passangerCapacity;

    @Column(name="FUEL_TYPE")
    private String fuelType;

    @Column(name="FEATURE")
    private String feature;

    @Column(name="TOTAL_RUNNING(KM)")
    private Integer totalRunning;

    @Column(name="CHARGES")
    private Double charge;

//    @OneToMany(mappedBy = "car",cascade = CascadeType.ALL)
//    private List<BookingForm> bookingForm;
//
//    @OneToMany(mappedBy = "car",cascade = CascadeType.ALL)
//    private List<AtmPage> atmPage;

}
