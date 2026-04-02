package com.example.ridebookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ridebookingsystem.entity.Ride;

@Repository
public interface RideRepo extends JpaRepository<Ride,Long>{
    
}
