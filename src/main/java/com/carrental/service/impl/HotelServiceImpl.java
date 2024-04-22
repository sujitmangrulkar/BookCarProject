package com.carrental.service.impl;

import com.carrental.entity.Hotel;
import com.carrental.exception.ResourceNotFoundException;
import com.carrental.payload.request.HotelDtoRequest;
import com.carrental.payload.response.HotelDtoResponse;
import com.carrental.repository.HotelRepository;
import com.carrental.service.HotelService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelServiceImpl implements HotelService
{
    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public HotelDtoResponse newHotel(HotelDtoRequest hotelDtoRequest)
    {
        Hotel hotel= this.modelMapper.map(hotelDtoRequest, Hotel.class);
        Hotel savedHotel = this.hotelRepository.save(hotel);
        return this.modelMapper.map(savedHotel,HotelDtoResponse.class);
    }

    @Override
    public List<HotelDtoResponse> getAllHotels()
    {
        List<Hotel> allHotels= this.hotelRepository.findAll();
        return allHotels.stream().map((hotel)->modelMapper.map(hotel,HotelDtoResponse.class)).collect(Collectors.toList());
    }

    @Override
    public HotelDtoResponse getHotelById(String hotelId)
    {
        Hotel hotel = this.hotelRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel", "HotelId", hotelId));
        return this.modelMapper.map(hotel, HotelDtoResponse.class);
    }
}
