package com.example.dtoexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dtoexample.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
