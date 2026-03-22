package com.example.department_employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department_employee.entity.Employees;
import com.example.department_employee.repository.EmployeesRepo;

@Service
public class EmployeesService{

    @Autowired
    private EmployeesRepo erepo;

    public Optional<Employees> getEmployeesById(Long id){
        return erepo.findById(id);
    }

    public Employees updateEmployees(Long id,Employees employees){
        Employees e=erepo.findById(id).orElseThrow(() -> new RuntimeException("Error hai :"+id));
        e.setName(employees.getName());
        e.setAge(employees.getAge());
        e.setExpertise(employees.getExpertise());
        e.setSalary(employees.getSalary());
        return erepo.save(e);
    }

}