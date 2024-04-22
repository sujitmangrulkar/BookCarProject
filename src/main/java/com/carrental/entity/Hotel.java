package com.carrental.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="HOTEL_DTLS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hotel
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String hotelId;

    @Column(name="HOTEL_NAME")
    private String hotel;

    @Column(name="ROOM_TYPE")
    private String room;

    @Column(name="STAY_DAYS")
    private Integer stay;

    @Column(name="PARKING")
    private String manageParking;

    @Column(name="FINAL_COST")
    private double finalCost;

//    @OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
//    private List<AtmPage> atmPage;

}
