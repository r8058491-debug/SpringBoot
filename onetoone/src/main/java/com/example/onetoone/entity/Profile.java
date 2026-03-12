package com.example.onetoone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tel;
   

    public Profile() {

    }

    public Profile(String t) {
        this.tel = t;
    }

    public Long getId() {
        return id;
    }

    public String getTel() {
        return tel;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
