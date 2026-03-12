package com.example.aadharcard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aadhar{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private int aadhar_Number;
    private String address;

    public Aadhar(){}

    public Aadhar(int a,String add){
        this.aadhar_Number=a;
        this.address=add;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAadhar_Number() {
        return aadhar_Number;
    }

    public void setAadhar_Number(int aadhar_Number) {
        this.aadhar_Number = aadhar_Number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    



    

}