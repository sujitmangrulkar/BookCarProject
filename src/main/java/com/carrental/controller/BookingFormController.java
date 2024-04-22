package com.carrental.controller;

import com.carrental.payload.request.BookingFormDtoRequest;
import com.carrental.payload.response.BookingFormDtoResponse;
import com.carrental.service.BookingFormService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer/auth")
@CrossOrigin
public class BookingFormController
{
    @Autowired
    private BookingFormService bookingFormService;

    @PostMapping("/book-now")
    public ResponseEntity<BookingFormDtoResponse> newBooking(@RequestBody BookingFormDtoRequest bookingFormDtoRequest)
    {
        BookingFormDtoResponse bookingFormDtoResponse = this.bookingFormService.newBooking(bookingFormDtoRequest);
        return new ResponseEntity<>(bookingFormDtoResponse, HttpStatus.CREATED);

    }
}
