package com.example.doctor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.doctor.entity.Doctor;
public interface DoctorRepository extends JpaRepository<Doctor,Long> {
    public List<Doctor> findByName(String name);

}
