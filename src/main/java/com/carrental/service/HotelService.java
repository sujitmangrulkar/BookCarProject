package com.carrental.service;

import com.carrental.payload.request.HotelDtoRequest;
import com.carrental.payload.response.HotelDtoResponse;

import java.util.List;

public interface HotelService
{
    HotelDtoResponse newHotel(HotelDtoRequest hotelDtoRequest);
    List<HotelDtoResponse> getAllHotels();
    HotelDtoResponse getHotelById(String hotelId);
}
