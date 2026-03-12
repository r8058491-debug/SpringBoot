package com.example.aadharcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aadharcard.entity.Aadhar;

public interface AadharRepo extends JpaRepository<Aadhar,Long>{
    
}