package com.example.department_employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.department_employee.entity.Department;
import com.example.department_employee.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService dservice;

    @PostMapping("/create")
    public Department createDepartment(@RequestBody Department department){
        return dservice.createDepartment(department);
    }

    @GetMapping("/getall")
    public List<Department> getAll(){
        return dservice.getAll();
    }

    @GetMapping("get/{id}")
    public Optional<Department> getById(@PathVariable Long id){
        return dservice.getDepartmentById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable Long id){
        return dservice.deleteEmployee(id);
    }


}