package com.carrental.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="BOOKING_DTLS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingForm
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
   // private String carId;
    private String pickUpLocation;
    private String dropLocation;
    private LocalTime pickUpTime;
    private LocalDate pickUpDate;
    private LocalDate dropDate;
    private Integer passangerCapacity;
    private Integer members;
    private Integer days;
    private Integer numOfBags;
    private Double totalPrice;


    private String bookingFormDuplicate;
//    @ManyToOne
//    private Car car;
//
//    @OneToOne(mappedBy = "bookingForm",cascade = CascadeType.ALL)
//    private AtmPage atmPage;


}
