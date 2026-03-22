package com.example.department_employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department_employee.entity.Department;
import com.example.department_employee.entity.Employees;
import com.example.department_employee.repository.DepartmentRepo;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo drepo;

    public Department createDepartment(Department department) {

        List<Employees> employees = department.getEmployees();

        for (Employees e : employees) {
            e.setDepartment(department);
        }

        return drepo.save(department);
    }

    public List<Department> getAll() {
        return drepo.findAll();
    }

    public Optional<Department> getDepartmentById(Long id) {
        return drepo.findById(id);
    }

    public String deleteEmployee(Long id) {
        drepo.deleteById(id);
        return "(Deleted Successfully)";
    }

}
