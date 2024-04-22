package com.carrental.payload.request;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AtmDtoRequest
{
    //private String driverId;

 //   private String cardNumber;
//
//    private  String cardName;
//
//    private String expiry;
//
//    private Integer cvv;

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
}
