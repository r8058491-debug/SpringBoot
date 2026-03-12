package com.example.employee_parking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee_parking.entity.Employee;
import com.example.employee_parking.repository.EmployeeRepo;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public Employee createEmployee(Employee employee) {
        return repo.save(employee);
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Optional<Employee> getById(Long id) {
        return repo.findById(id);
    }

    public Optional<Employee> getByName(String name) {
        return repo.findByName(name);
    }

    public Employee updateEmployee(Long id, Employee employee) {
        Employee e = repo.findById(id).orElseThrow(null);
        e.setName(employee.getName());
        e.setMobileNumber(employee.getMobileNumber());
        e.setParking(employee.getParking());
        return repo.save(e);
    }

    public Employee updateEmployeeByName(String name, Employee employee) {
        Employee nam = repo.findByName(name).orElseThrow(null);
        nam.setName(employee.getName());
        return repo.save(nam);
    }

    public void deleteEmployee(Long id) {
        repo.deleteById(id);
        System.out.println("Deleted...");
    }
}
