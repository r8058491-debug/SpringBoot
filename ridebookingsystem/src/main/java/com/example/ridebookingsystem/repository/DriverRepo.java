package com.example.ridebookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ridebookingsystem.entity.Driver;

@Repository
public interface DriverRepo  extends JpaRepository<Driver,Long>{
    
}
