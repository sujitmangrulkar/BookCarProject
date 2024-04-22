package com.carrental.repository;

import com.carrental.entity.BookingForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingFormRepository extends JpaRepository<BookingForm,String>
{

}
