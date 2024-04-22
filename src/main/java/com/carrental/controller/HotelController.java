package com.carrental.controller;

import com.carrental.payload.request.HotelDtoRequest;
import com.carrental.payload.response.HotelDtoResponse;
import com.carrental.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer/auth/hotel")
@CrossOrigin
public class HotelController
{
    @Autowired
    private HotelService hotelService;

    @PostMapping("/driver-hotel")
    public ResponseEntity<HotelDtoResponse> addNewHotel(@RequestBody HotelDtoRequest hotelDtoRequest)
    {
        HotelDtoResponse hotelDtoResponse = this.hotelService.newHotel(hotelDtoRequest);

        return new ResponseEntity<>(hotelDtoResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<HotelDtoResponse>> getAllHotels()
    {
        List<HotelDtoResponse> allHotels = this.hotelService.getAllHotels();
        return new ResponseEntity<>(allHotels,HttpStatus.OK);
    }

    @GetMapping("/hotelbyid/{hotelId}")
    public ResponseEntity<HotelDtoResponse> getHotelById(@PathVariable String hotelId)
    {
        HotelDtoResponse hotelById = this.hotelService.getHotelById(hotelId);
        return new ResponseEntity<>(hotelById,HttpStatus.OK);
    }
}
