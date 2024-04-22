package com.carrental.controller;

import com.carrental.payload.request.AtmDtoRequest;
import com.carrental.payload.response.AtmDtoResponse;
import com.carrental.service.AtmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer/auth/pay")
@CrossOrigin
public class AtmPageController
{
    @Autowired
    private AtmService atmService;

    @PostMapping("/finalConfirm")
    public ResponseEntity<AtmDtoResponse> addNewPayment(@RequestBody AtmDtoRequest atmDtoRequest)
    {
        AtmDtoResponse atmDtoResponse = this.atmService.newPayment(atmDtoRequest);
        System.out.println(atmDtoResponse);
        return new ResponseEntity<>(atmDtoResponse, HttpStatus.CREATED);
    }

    @GetMapping("/getallpayments")
    public ResponseEntity<List<AtmDtoResponse>> getAllPayments()
    {
        List<AtmDtoResponse> allPayments = this.atmService.getAllPayments();
        return new ResponseEntity<>(allPayments,HttpStatus.OK);
    }

    @GetMapping("/paymentbyid/{paymentId}")
    public ResponseEntity<AtmDtoResponse> getPaymentById(String paymentId)
    {
        AtmDtoResponse paymentById = this.atmService.getPaymentById(paymentId);
        return new ResponseEntity<>(paymentById,HttpStatus.OK);
    }

    @GetMapping("/ticket-details/{email}")
    public ResponseEntity<List<AtmDtoResponse>> getPaymentsByEmail(@PathVariable String email)
    {
        List<AtmDtoResponse> paymentByEmail = this.atmService.getPaymentByEmail(email);
        System.out.println(paymentByEmail);
        return new ResponseEntity<>(paymentByEmail,HttpStatus.OK);
    }
}
