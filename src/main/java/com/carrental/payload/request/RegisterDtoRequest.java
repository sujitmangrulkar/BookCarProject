package com.carrental.payload.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDtoRequest
{
    private String fname;

    private String lname;

    private LocalDate dob;

    private String email;

    private String password;

}
