package com.example.profile_User.entity;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long profile_id;
   
    private String phone_number;
    private String address;
    private Date dob;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;

    public Profile(){}
    

    public Profile(String p,String a,Date d,User user){
        this.phone_number=p;
        this.address=a;
        this.dob=d;
        this.user=user;
    }


    public String getPhone_number() {
        return phone_number;
    }


    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public Date getDob() {
        return dob;
    }


    public void setDob(Date dob) {
        this.dob = dob;
    }


    public Long getProfile_id() {
        return profile_id;
    }


    public void setProfile_id(Long profile_id) {
        this.profile_id = profile_id;
    }


    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }

    
}
