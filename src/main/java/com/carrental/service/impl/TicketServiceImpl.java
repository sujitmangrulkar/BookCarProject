package com.carrental.service.impl;

import com.carrental.entity.*;
import com.carrental.exception.ResourceNotFoundException;
import com.carrental.payload.response.TicketDtoResponse;
import com.carrental.repository.AtmRepository;
import com.carrental.repository.TicketRepository;
import com.carrental.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService
{
    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AtmRepository atmRepository;

//    @Override
//    public TicketDtoResponse generateTicket(String paymentId)
//    {
//        AtmPage atmPage = this.atmRepository.findById(paymentId).orElseThrow(() -> new ResourceNotFoundException("Payment", "PaymentId", paymentId));
//
//        User user = atmPage.getUser();
//        Driver driver = atmPage.getDriver();
//       // Hotel hotel = atmPage.getHotel();
//        Car car = atmPage.getCar();
//        BookingForm bookingForm = atmPage.getBookingForm();
//        Ticket ticket = new Ticket();
//        ticket.setPaymentId(paymentId);
//        ticket.setEmailId(user.getEmail());
//
//        this.ticketRepository.save(ticket);
//
//        TicketDtoResponse ticketDtoResponse = new TicketDtoResponse();
//        ticketDtoResponse.setEmail(user.getEmail());
//        ticketDtoResponse.setFname(user.getFname());
//        ticketDtoResponse.setLname(user.getLname());
//
//        ticketDtoResponse.setDriverImg(driver.getDriverImg());
//        ticketDtoResponse.setDriverName(driver.getDriverName());
//        ticketDtoResponse.setDriverMobNo(driver.getDriverMobNo());
//        ticketDtoResponse.setCharges(driver.getCharges());
//
//        //ticketDtoResponse.setHotel(hotel);
//
//        ticketDtoResponse.setCarCompany(car.getCarCompany());
//        ticketDtoResponse.setCarColor(car.getCarColor());
//        ticketDtoResponse.setCarModel(car.getCarModel());
//        ticketDtoResponse.setCarType(car.getCarType());
//        ticketDtoResponse.setCarImg(car.getCarImg());
//        ticketDtoResponse.setFuelType(car.getFuelType());
//
//        ticketDtoResponse.setPickUpLocation(bookingForm.getPickUpLocation());
//        ticketDtoResponse.setDropLocation(bookingForm.getDropLocation());
//        ticketDtoResponse.setPickUpTime(bookingForm.getPickUpTime());
//        ticketDtoResponse.setPickUpDate(bookingForm.getPickUpDate());
//        ticketDtoResponse.setDropDate(bookingForm.getDropDate());
//        ticketDtoResponse.setPassangerCapacity(bookingForm.getPassangerCapacity());
//        ticketDtoResponse.setMembers(bookingForm.getMembers());
//        ticketDtoResponse.setDays(bookingForm.getDays());
//
//        ticketDtoResponse.setCardNo(atmPage.getCardNumber());
//
//        return ticketDtoResponse;
//    }

//    @Override
//    public TicketDtoResponse getTicketByEmailId(String emailId)
//    {
//
//
//        return null;
//    }

//    @Override
//    public TicketDtoResponse getTicketByUserId(String userId) {
//        return null;
//    }

}
