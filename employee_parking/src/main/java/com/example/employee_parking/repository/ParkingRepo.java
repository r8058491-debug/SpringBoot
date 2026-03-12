package com.example.employee_parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee_parking.entity.Parking;

public interface ParkingRepo extends JpaRepository<Parking,Long>{
    
}
