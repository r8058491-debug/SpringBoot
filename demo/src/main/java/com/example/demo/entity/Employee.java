package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private Double salary;


    public Employee(){

    }
    
    public Employee(String n,String e,Double s){
        this.name=n;
        this.email=e;
        this.salary=s;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public Double getSalary(){
        return salary;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setName(String n){
        this.name=n;
    }

    public void setEmail(String e){
        this.email=e;
    }
    public void setSalary(Double s){
        this.salary=s;
    }
}
