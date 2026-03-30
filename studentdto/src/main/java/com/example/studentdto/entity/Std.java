package com.example.studentdto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Std {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    String name;
    int standard;
    String mobileNo;
    String fatherName;
    String fatherOccupation;

    public Std(){}

    public Std(String n,int s, String m, String f,String fo){
        this.name=n;
        this.standard=s;
        this.mobileNo=m;
        this.fatherName=f;
        this.fatherOccupation=fo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherOccupation() {
        return fatherOccupation;
    }

    public void setFatherOccupation(String fatherOccupation) {
        this.fatherOccupation = fatherOccupation;
    }

    
    
}
