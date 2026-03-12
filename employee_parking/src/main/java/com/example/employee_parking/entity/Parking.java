package com.example.employee_parking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Parking {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long parking_id;

    private int number;

    public Long getParking_id() {
        return parking_id;
    }

    public void setParking_id(Long parking_id) {
        this.parking_id = parking_id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    
}
