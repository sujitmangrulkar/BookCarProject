package com.carrental.payload.response;

import com.carrental.entity.Car;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingFormDtoResponse
{
    private String carId;
    private String carCompany;
    private String carColor;
    private String carModel;
    private String carType;
    private String carOwner;
    private String carImg;

    private String numPlate;
    //    private String insurance;
    private LocalDate insuranceValidity;
    private String fuelType;
    private String feature;
    private String pickUpLocation;
    private String dropLocation;
    private LocalTime pickUpTime;
    private LocalDate pickUpDate;
    private LocalDate dropDate;
    private Integer passengerCapacity;
    private Integer members;
    private Integer days;
    private Integer numOfBags;
    private Double totalPrice;


}
