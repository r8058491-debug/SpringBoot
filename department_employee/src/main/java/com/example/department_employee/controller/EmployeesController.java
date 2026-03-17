package com.example.department_employee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.department_employee.entity.Employees;
import com.example.department_employee.service.EmployeesService;

@RestController
@RequestMapping("/employees")
public class EmployeesController{

    @Autowired
    private EmployeesService eservice;

    @GetMapping("/get/{id}")
    public Optional<Employees> getEmployeesById(@PathVariable Long id){
        return eservice.getEmployeesById(id);
    }

    @PutMapping("/update/{id}")
    public Employees updateEmployees(@PathVariable Long id,@RequestBody Employees employees){
        return eservice.updateEmployees(id, employees);
    }


} 

