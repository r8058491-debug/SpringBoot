package com.example.department_employee.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column(name="dept_id")
    private Long id;

    private String dept_name;
    @OneToMany(mappedBy="department",cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true)
    @JsonManagedReference
    private List<Employees> employees=new ArrayList<>();

    public Department(){}

    public Department(String d){
        this.dept_name=d;
    }

    public Long getId() {
        return id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public List<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }

    

}
