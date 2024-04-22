package com.carrental.repository;

import com.carrental.entity.AtmPage;
import com.carrental.payload.response.AtmDtoResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AtmRepository extends JpaRepository<AtmPage,String>
{
 List<AtmPage> findByEmail(String email);
}
