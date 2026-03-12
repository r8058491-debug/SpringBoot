package com.example.employee_parking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_parking.entity.Employee;
import com.example.employee_parking.service.EmployeeService;

@RestController
@RequestMapping("/parkingAllot")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return service.createEmployee(employee);
    }

    @GetMapping("/getAll")
    public List<Employee> getAll() {
        return service.getAll();
    }

    @GetMapping("/get/{id}")

    public Optional<Employee> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/updateAll/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return service.updateEmployee(id, employee);
    }

    @PutMapping("/update/{name}")
    public Employee updateEmployeeByName(@PathVariable String name, @RequestBody Employee employee) {
        return service.updateEmployeeByName(name, employee);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(@PathVariable Long id) {
        service.deleteEmployee(id);
        System.out.println("Deleted Successfully....");

    }
}
