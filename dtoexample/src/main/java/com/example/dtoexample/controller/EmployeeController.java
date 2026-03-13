package com.example.dtoexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dtoexample.dto.Employeedto;
import com.example.dtoexample.entity.Employee;
import com.example.dtoexample.service.EmployeeService;

@RestController
@RequestMapping("/employeedetails")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/create")
    public Employeedto createEmployee(@RequestBody Employee employee) {
        return service.createEmployee(employee);
    }

    @GetMapping("/getall")
    public List<Employee> getAll() {
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Employeedto getEmployeeById(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public Employeedto updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return service.updateEmployee(id, employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
        return "Deleted Successfully....";
    }

}
