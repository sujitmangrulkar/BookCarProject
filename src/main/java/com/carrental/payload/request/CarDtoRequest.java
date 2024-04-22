package com.carrental.payload.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarDtoRequest
{

    private String id;
    private String carCompany;
    private String carColor;
    private String carModel;
    private String carType;
    private String carImg;
    private String car360;
    private String carOwner;
    private String numPlate;
    private LocalDate regDate;
    private String insurance;
    private LocalDate insuranceValidity;
    private Integer passangerCapacity;
    private String fuelType;
    private String feature;
    private Integer totalRunning;
    private Double charge;
}
