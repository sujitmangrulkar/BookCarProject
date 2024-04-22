package com.carrental.controller;

import com.carrental.payload.request.DriverDtoRequest;
import com.carrental.payload.response.DriverDtoResponse;
import com.carrental.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer/auth")
@CrossOrigin
public class DriverController
{
    @Autowired
    private DriverService driverService;

    @PostMapping
    public ResponseEntity<DriverDtoResponse> addNewDriver(@RequestBody DriverDtoRequest driverDtoRequest)
    {
        DriverDtoResponse driverDtoResponse = this.driverService.addNewDriver(driverDtoRequest);
        return new ResponseEntity<>(driverDtoResponse , HttpStatus.CREATED);
    }

    @GetMapping("/driverbyid/{driverId}")
    public ResponseEntity<DriverDtoResponse> getDriverById(@PathVariable String driverId)
    {
        DriverDtoResponse driverById = this.driverService.getDriverById(driverId);
        return new ResponseEntity<>(driverById,HttpStatus.OK);
    }

    @GetMapping("/drivers")
    public ResponseEntity<List<DriverDtoResponse>> getAllDrivers()
    {
        List<DriverDtoResponse> allDrivers = this.driverService.getAllDrivers();
        return new ResponseEntity<>(allDrivers,HttpStatus.OK);
    }
}
