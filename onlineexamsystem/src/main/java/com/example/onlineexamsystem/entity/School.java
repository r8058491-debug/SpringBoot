package com.example.onlineexamsystem.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class School {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    String name;

    @JsonManagedReference
    @OneToMany(mappedBy="school",cascade=CascadeType.ALL)
    private List<Student> student=new ArrayList<>();

    public School(){}

    public School(String n){
        this.name=n;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
