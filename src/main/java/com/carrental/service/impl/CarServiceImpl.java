package com.carrental.service.impl;

import com.carrental.entity.Car;
import com.carrental.exception.ResourceNotFoundException;
import com.carrental.payload.request.CarDtoRequest;
import com.carrental.payload.response.CarDtoResponse;
import com.carrental.repository.CarRepository;
import com.carrental.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService
{
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CarDtoResponse addNewCar(CarDtoRequest carDtoRequest)
    {
        Car car = this.modelMapper.map(carDtoRequest, Car.class);
        Car savedCar = this.carRepository.save(car);

        return this.modelMapper.map(savedCar,CarDtoResponse.class);
    }

    @Override
    public List<CarDtoResponse> getAllCars()
    {
        List<Car> allCars = this.carRepository.findAll();

        return allCars.stream().map((car)->modelMapper.map(car,CarDtoResponse.class)).collect(Collectors.toList());
    }

    public CarDtoResponse getCarById(String carId)
    {
        Car car = this.carRepository.findById(carId).orElseThrow(() -> new ResourceNotFoundException("Car", "CarId", carId));

        return this.modelMapper.map(car, CarDtoResponse.class);
    }
}
