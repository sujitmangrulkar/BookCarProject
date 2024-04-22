package com.carrental.payload.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DriverDtoRequest
{
    private String driverImg;
    private String driverName;
    private String driverExperiance;
    private String driverMobNo;
    private String availability;
    private String food;
    private String smoke;
    private String drink;
    private Double charges;
}
