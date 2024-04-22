package com.carrental.service;

import com.carrental.payload.request.RegisterDtoRequest;
import com.carrental.payload.response.RegisterDtoResponse;


public interface RegisterService
{

    RegisterDtoResponse newRegistration(RegisterDtoRequest registerDtoRequest);

}
