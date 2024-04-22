package com.carrental.repository;

import com.carrental.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,String>
{
}
