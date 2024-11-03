package com.carrental.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="PAYMENT_DTLS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AtmPage
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String fname;
    private String lname;
    private String email;
    private String driverImg;
    private String driverID;
    private String driverName;
    private String driverMobNo;
    private Double charges;
    private String hotel;
    private String room;
    private Integer stay;
    private String manageParking;
    private Double finalCost;
    private Double charge;
    private String carCompany;
    private String carColor;
    private String carModel;
    private String carType;
    private String carImg;
    private String fuelType;
    private String pickUpLocation;
    private String dropLocation;
    private LocalTime pickUpTime;
    private LocalDate pickUpDate;
    private LocalDate dropDate;
    private Integer passangerCapacity;
    private Integer members;
    private Integer days;
    private String cardNo;

    private String trial;

    private String trial2;


//    @ManyToOne
//    private User user;
//
//    @ManyToOne
//    private Driver driver;
//
//    //@ManyToOne
//    //private Hotel hotel;
//
//    @ManyToOne
//    private Car car;
//
//    @OneToOne
//    private BookingForm bookingForm;

}
