package com.carrental.service.impl;

import com.carrental.entity.AtmPage;
import com.carrental.exception.ResourceNotFoundException;
import com.carrental.payload.request.AtmDtoRequest;
import com.carrental.payload.response.AtmDtoResponse;
import com.carrental.repository.AtmRepository;
import com.carrental.service.AtmService;
import com.carrental.service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AtmServiceImpl implements AtmService
{
    @Autowired
    private AtmRepository atmRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private TicketService ticketService;

    @Override
    public AtmDtoResponse newPayment(AtmDtoRequest atmDtoRequest)
    {
        AtmPage payment= this.modelMapper.map(atmDtoRequest, AtmPage.class);
        System.out.println(payment);
        AtmPage savedPayment = this.atmRepository.save(payment);
        System.out.println(savedPayment);
        return this.modelMapper.map(savedPayment,AtmDtoResponse.class);
    }

    @Override
    public List<AtmDtoResponse> getAllPayments()
    {
        List<AtmPage> allPayments = this.atmRepository.findAll();

        return allPayments.stream().map((payment)->modelMapper.map(payment,AtmDtoResponse.class)).collect(Collectors.toList());
    }

    @Override
    public AtmDtoResponse getPaymentById(String paymentId)
    {
        AtmPage atmPage = this.atmRepository.findById(paymentId).orElseThrow(() -> new ResourceNotFoundException("Payment", "Payment Id", paymentId));


        return this.modelMapper.map(atmPage,AtmDtoResponse.class);
    }

    @Override
    public List<AtmDtoResponse> getPaymentByEmail(String email)
    {
        List<AtmPage> byEmail = this.atmRepository.findByEmail(email);
        System.out.println(byEmail);

        return byEmail.stream().map((payment)->modelMapper.map(payment,AtmDtoResponse.class)).collect(Collectors.toList());
    }
}
