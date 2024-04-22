package com.carrental.service;

import com.carrental.payload.request.DriverDtoRequest;
import com.carrental.payload.response.DriverDtoResponse;

import java.util.List;

public interface DriverService
{
    DriverDtoResponse addNewDriver(DriverDtoRequest driverDtoRequest);

    DriverDtoResponse getDriverById(String driverId);

    List<DriverDtoResponse> getAllDrivers();
}
