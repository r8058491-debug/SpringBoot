package com.example.dtoexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dtoexample.dto.Employeedto;
import com.example.dtoexample.entity.Employee;
import com.example.dtoexample.repository.EmployeeRepo;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public Employeedto createEmployee(Employee employee) {
        Employee saved = repo.save(employee);
        return convertToDto(saved);
    }

    private Employeedto convertToDto(Employee employee) {
        return new Employeedto(
                employee.getId(),
                employee.getName(),
                employee.getEmail());
    }

    public List<Employeedto> getAll() {
        return repo.find();
    }

    public Employeedto getEmployeeById(Long id) {
        Optional<Employee> employee = repo.findById(id);
        return employee.map(this::convertToDto).orElse(null);
    }

    public Employeedto updateEmployee(Long id, Employee empdetails) {
        Optional<Employee> e = repo.findById(id);

        if (e.isPresent()) {
            Employee emp = e.get();

            if (empdetails.getId() != null) {
                emp.setId(empdetails.getId());
            }

            if (empdetails.getName() != null) {
                emp.setName(empdetails.getName());
            }

            if (empdetails.getEmail() != null) {
                emp.setEmail(empdetails.getEmail());
            }

            Employee updatedemployee = repo.save(emp);
            return convertToDto(updatedemployee);
        }
        return null;
    }

    public String deleteEmployee(Long id){
        repo.deleteById(id);
        return "Deleted Successfully.....";
    }

}
