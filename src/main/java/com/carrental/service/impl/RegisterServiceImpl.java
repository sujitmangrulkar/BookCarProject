package com.carrental.service.impl;

import com.carrental.entity.User;
import com.carrental.payload.request.RegisterDtoRequest;
import com.carrental.payload.response.RegisterDtoResponse;
import com.carrental.repository.RegisterRepository;
import com.carrental.service.RegisterService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService
{
    @Autowired
    private RegisterRepository registerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public RegisterDtoResponse newRegistration(RegisterDtoRequest registerDtoRequest)
    {
        User signup = this.modelMapper.map(registerDtoRequest, User.class);
        signup.setPassword(passwordEncoder.encode(registerDtoRequest.getPassword()));
        User savedSignup = this.registerRepository.save(signup);
        return this.modelMapper.map(savedSignup, RegisterDtoResponse.class);
    }
}
