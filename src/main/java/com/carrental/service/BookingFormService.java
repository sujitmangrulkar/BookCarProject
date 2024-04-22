package com.carrental.service;

import com.carrental.payload.request.BookingFormDtoRequest;
import com.carrental.payload.response.BookingFormDtoResponse;

import java.util.List;

public interface BookingFormService
{
    BookingFormDtoResponse newBooking(BookingFormDtoRequest bookingFormDtoRequest);

    List<BookingFormDtoResponse> getAllBookings();

    BookingFormDtoResponse getBookingById(String bookingId);

    List<BookingFormDtoResponse> getBookingByUserId(String userId);

}
