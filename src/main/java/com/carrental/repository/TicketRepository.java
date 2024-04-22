package com.carrental.repository;

import com.carrental.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,String>
{

}
