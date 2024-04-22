package com.carrental.service;

import com.carrental.payload.request.AtmDtoRequest;
import com.carrental.payload.response.AtmDtoResponse;

import java.util.List;

public interface AtmService
{
    AtmDtoResponse newPayment(AtmDtoRequest atmDtoRequest);

    List<AtmDtoResponse> getAllPayments();

    AtmDtoResponse getPaymentById(String paymentId);

    List<AtmDtoResponse> getPaymentByEmail(String email);
}
