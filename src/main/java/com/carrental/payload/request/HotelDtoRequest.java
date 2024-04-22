package com.carrental.payload.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelDtoRequest
{

    private String hotel;

    private String room;

    private Integer stay;

    private String manageParking;

    private double finalCost;
}
