package com.example.department_employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.department_employee.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department,Long>{

}
