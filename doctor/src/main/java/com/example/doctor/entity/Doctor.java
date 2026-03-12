package com.example.doctor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;
    private Integer experience;

    public Doctor() {

    }

    public Doctor(String n, String s, Integer e) {
        this.name = n;
        this.specialization = s;
        this.experience = e;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long i) {
        this.id = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String s) {
        this.specialization = s;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer e) {
        this.experience = e;
    }

}
