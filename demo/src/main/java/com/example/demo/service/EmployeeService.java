package com.example.demo.service;

import java.util.List;
import java.util.Optional;
//@Autowired
import org.springframework.beans.factory.annotation.Autowired;
//@Service
import org.springframework.stereotype.Service;
//Employee
import com.example.demo.entity.Employee;
//EmployeeRepository
import com.example.demo.repository.EmployeeRepository;
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return repository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id){
        return repository.findById(id);
    }

    public Employee updateEmployee(Long id,Employee employee){
        Employee existing=repository.findById(id).orElseThrow();
        existing.setName(employee.getName());
        existing.setEmail(employee.getEmail());
        existing.setSalary(employee.getSalary());
        return repository.save(existing);
    }

    public void deleteEmployee(Long id){
        repository.deleteById(id);
    }

}
