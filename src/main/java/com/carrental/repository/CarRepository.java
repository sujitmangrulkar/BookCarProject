package com.carrental.repository;

import com.carrental.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,String>
{

}
