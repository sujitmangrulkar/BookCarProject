package com.carrental.controller;

import com.carrental.payload.request.RegisterDtoRequest;
import com.carrental.payload.response.RegisterDtoResponse;
import com.carrental.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class RegisterController
{
    @Autowired
    private RegisterService registerService;

    @PostMapping
    public ResponseEntity<RegisterDtoResponse> newRegistration(@RequestBody RegisterDtoRequest registerDtoRequest)
    {
        RegisterDtoResponse registerDtoResponse = this.registerService.newRegistration(registerDtoRequest);

        return new ResponseEntity<>(registerDtoResponse, HttpStatus.CREATED);
    }
}
