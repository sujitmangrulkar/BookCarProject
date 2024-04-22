package com.carrental.payload.response;

import com.carrental.entity.Hotel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketDtoResponse
{
     private String ticketId;
     private String email;
     private String fname;
     private String lname;
     private String driverImg;
     private String driverName;
     private String driverMobNo;
     private Double charges;
     private Hotel hotel;
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
