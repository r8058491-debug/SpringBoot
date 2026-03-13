package com.example.dtoexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dtoexample.dto.Employeedto;
import com.example.dtoexample.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    public List<Employeedto> find();
    
}
