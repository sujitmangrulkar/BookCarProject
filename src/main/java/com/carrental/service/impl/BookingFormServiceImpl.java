package com.carrental.service.impl;

import com.carrental.entity.BookingForm;
import com.carrental.entity.Car;
import com.carrental.exception.ResourceNotFoundException;
import com.carrental.payload.request.BookingFormDtoRequest;
import com.carrental.payload.response.BookingFormDtoResponse;
import com.carrental.repository.BookingFormRepository;
import com.carrental.repository.CarRepository;
import com.carrental.service.BookingFormService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.List;

@Service
public class BookingFormServiceImpl implements BookingFormService
{
    @Autowired
    private BookingFormRepository bookingFormRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CarRepository carRepository;

    @Override
    public BookingFormDtoResponse newBooking(BookingFormDtoRequest bookingFormDtoRequest)
    {
        BookingForm bookingForm = this.modelMapper.map(bookingFormDtoRequest, BookingForm.class);

        Car car = this.carRepository.findById(bookingFormDtoRequest.getCarId()).orElseThrow(() -> new ResourceNotFoundException("Car", "Car Id", bookingFormDtoRequest.getCarId()));

        //bookingForm.setCar(car);
        bookingForm.setDays(Period.between(bookingFormDtoRequest.getPickUpDate(),bookingFormDtoRequest.getDropDate()).getDays());
        bookingForm.setTotalPrice(bookingForm.getDays()*car.getCharge());

        BookingForm savedBooking = this.bookingFormRepository.save(bookingForm);

        BookingFormDtoResponse bookingFormDtoResponse=new BookingFormDtoResponse();
        bookingFormDtoResponse.setCarId(car.getId());
        bookingFormDtoResponse.setCarCompany(car.getCarCompany());
        bookingFormDtoResponse.setCarColor(car.getCarColor());
        bookingFormDtoResponse.setCarModel(car.getCarModel());
        bookingFormDtoResponse.setCarType(car.getCarType());
        bookingFormDtoResponse.setCarOwner(car.getCarOwner());
        bookingFormDtoResponse.setCarImg(car.getCarImg());
        bookingFormDtoResponse.setNumPlate(car.getNumPlate());
        bookingFormDtoResponse.setInsuranceValidity(car.getInsuranceValidity());
        bookingFormDtoResponse.setFuelType(car.getFuelType());
        bookingFormDtoResponse.setFeature(car.getFeature());
        bookingFormDtoResponse.setTotalPrice(car.getCharge()*bookingFormDtoRequest.getDays());
        bookingFormDtoResponse.setDays(bookingFormDtoRequest.getDays());
        bookingFormDtoResponse.setDropDate(bookingFormDtoRequest.getDropDate());
        bookingFormDtoResponse.setDropLocation(bookingFormDtoRequest.getDropLocation());
        bookingFormDtoResponse.setMembers(bookingFormDtoRequest.getMembers());
        bookingFormDtoResponse.setNumOfBags(bookingFormDtoRequest.getNumOfBags());
        bookingFormDtoResponse.setPassengerCapacity(car.getPassangerCapacity());
        bookingFormDtoResponse.setPickUpDate(bookingFormDtoRequest.getPickUpDate());
        bookingFormDtoResponse.setPickUpTime(bookingFormDtoRequest.getPickUpTime());
        bookingFormDtoResponse.setPickUpLocation(bookingFormDtoRequest.getPickUpLocation());



        return bookingFormDtoResponse;
    }

    @Override
    public List<BookingFormDtoResponse> getAllBookings() {
        return null;
    }

    @Override
    public BookingFormDtoResponse getBookingById(String bookingId) {
        return null;
    }

    @Override
    public List<BookingFormDtoResponse> getBookingByUserId(String userId) {
        return null;
    }
}
