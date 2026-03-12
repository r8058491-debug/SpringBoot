package com.example.aadharcard.repository;

import com.example.aadharcard.entity.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long>{

    public Optional<User> findByName(String name);
    
}
