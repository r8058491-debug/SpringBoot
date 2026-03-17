package com.example.department_employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.department_employee.entity.Employees;

public interface EmployeesRepo extends JpaRepository<Employees,Long>{

}
