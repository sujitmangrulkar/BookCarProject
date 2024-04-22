package com.carrental.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDtoResponse
{
    private String registrationId;

    private String fname;

    private String lname;

    private LocalDate dob;

    private String email;

    private String password;
}
