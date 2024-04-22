package com.carrental.service;

import com.carrental.payload.request.CarDtoRequest;
import com.carrental.payload.response.CarDtoResponse;

import java.util.List;

public interface CarService
{
    CarDtoResponse addNewCar(CarDtoRequest carDtoRequest);

    List<CarDtoResponse> getAllCars();

    CarDtoResponse getCarById(String carId);
}
