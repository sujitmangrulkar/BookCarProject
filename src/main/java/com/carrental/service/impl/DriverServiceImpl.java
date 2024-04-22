package com.carrental.service.impl;

import com.carrental.entity.Driver;
import com.carrental.exception.ResourceNotFoundException;
import com.carrental.payload.request.DriverDtoRequest;
import com.carrental.payload.response.DriverDtoResponse;
import com.carrental.repository.DriverRepository;
import com.carrental.service.DriverService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DriverServiceImpl implements DriverService
{
    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public DriverDtoResponse addNewDriver(DriverDtoRequest driverDtoRequest)
    {
        Driver driver = this.modelMapper.map(driverDtoRequest, Driver.class);
        Driver savedDriver = this.driverRepository.save(driver);
        return this.modelMapper.map(savedDriver,DriverDtoResponse.class);
    }

    @Override
    public DriverDtoResponse getDriverById(String driverId)
    {
        Driver driver = this.driverRepository.findById(driverId).orElseThrow(() -> new ResourceNotFoundException("Driver", "Driver Id", driverId));

        return this.modelMapper.map(driver,DriverDtoResponse.class);

    }

    @Override
    public List<DriverDtoResponse> getAllDrivers()
    {
        List<Driver> allDrivers= this.driverRepository.findAll();
        return allDrivers.stream().map((driver)->modelMapper.map(driver,DriverDtoResponse.class)).collect(Collectors.toList());
    }
}
