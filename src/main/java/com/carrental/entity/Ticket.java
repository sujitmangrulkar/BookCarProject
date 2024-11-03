package com.carrental.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="TICKET_DTLS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String ticketId;

    @Column(name="PAYMENT_ID")
    private String paymentId;

    @Column(name="EmailId")
    private String emailId;

    private String ticket2;
}
