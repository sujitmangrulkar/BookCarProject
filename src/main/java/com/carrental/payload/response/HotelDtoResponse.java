package com.carrental.payload.response;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelDtoResponse
{
    private String hotelId;

    private String hotel;

    private String room;

    private Integer stay;

    private String manageParking;

    private double finalCost;
}
