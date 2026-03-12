package com.example.aadharcard.entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {

    private String name;
    private int age;
    private String tel;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="aadhar_id")
    private Aadhar aadhar;

    public User(){}

    public User(String n,int a,String t,Aadhar ad){
        this.aadhar=ad;
        this.name=n;
        this.age=a;
        this.tel=t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Aadhar getAadhar() {
        return aadhar;
    }

    public void setAadhar(Aadhar aadhar) {
        this.aadhar = aadhar;
    }

    

    
    
}
