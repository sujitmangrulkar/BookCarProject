package com.carrental.controller;

import com.carrental.payload.request.CarDtoRequest;
import com.carrental.payload.response.CarDtoResponse;
import com.carrental.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer/auth/car")
@CrossOrigin
public class CarController
{
    @Autowired
    private CarService carService;

    @PostMapping
    public ResponseEntity<CarDtoResponse> addNewCar(@RequestBody CarDtoRequest carDtoRequest) {
        CarDtoResponse carDtoResponse = this.carService.addNewCar(carDtoRequest);
        return new ResponseEntity<>(carDtoResponse, HttpStatus.CREATED);
    }

    @GetMapping("/cars")
    public ResponseEntity<List<CarDtoResponse>> getAllCars()
    {
        List<CarDtoResponse> allCars = this.carService.getAllCars();
        return new ResponseEntity<>(allCars,HttpStatus.OK);
    }

    @GetMapping("/{carId}")
    public ResponseEntity<CarDtoResponse> getCarById(@PathVariable String carId)
    {
        CarDtoResponse carById = this.carService.getCarById(carId);
        return new ResponseEntity<>(carById,HttpStatus.OK);
    }
}
