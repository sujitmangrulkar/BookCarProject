package com.carrental.repository;

import com.carrental.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegisterRepository extends JpaRepository<User,String>
{
    Optional<User> findByEmail(String email);

}
