package com.carrental.controller;

import com.carrental.entity.JwtRequest;
import com.carrental.entity.JwtResponse;
import com.carrental.payload.request.RegisterDtoRequest;
import com.carrental.payload.response.RegisterDtoResponse;
import com.carrental.security.JwtHelper;
import com.carrental.service.RegisterService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/customer/auth")
@CrossOrigin
public class AuthController
{

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private RegisterService registerService;


    @Autowired
    private JwtHelper helper;

    private Logger logger = LoggerFactory.getLogger(AuthController.class);


    @PostMapping("/login")
    public ResponseEntity<Map<String,Object>> login(@RequestBody JwtRequest request) {

        this.doAuthenticate(request.getEmail(), request.getPassword());


        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getEmail());
        String token = this.helper.generateToken(userDetails);

        JwtResponse response = JwtResponse.builder()
                .jwtToken(token)
                .username(userDetails.getUsername()).build();

        Map<String,Object> map=new HashMap<>();
        map.put("token",token);
        map.put("user",userDetails);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    private void doAuthenticate(String email, String password) {

        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(email, password);
        try {
            manager.authenticate(authentication);


        } catch (BadCredentialsException e) {
            throw new BadCredentialsException(" Invalid Username or Password  !!");
        }

    }

    @ExceptionHandler(BadCredentialsException.class)
    public String exceptionHandler() {
        return "Credentials Invalid !!";
    }

    @PostMapping("/register")
    public RegisterDtoResponse createUser(@Valid @RequestBody RegisterDtoRequest registerDtoRequest)
    {
        if(!registerDtoRequest.getPassword().equals(registerDtoRequest.getPassword()))
        {
            throw new IllegalArgumentException("Password Do Not Match");
        }
        return this.registerService.newRegistration(registerDtoRequest);
    }

}
