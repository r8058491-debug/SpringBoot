package com.example.employee_parking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee_parking.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    public Optional<Employee> findByName(String name);
}
