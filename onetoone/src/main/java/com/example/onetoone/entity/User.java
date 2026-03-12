package com.example.onetoone.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "profile_id")
    private Profile profile;

    public User(){}
    
    public User(String n,String e,Profile p){
        this.name=n;
        this.email=e;
        this.profile=p;
    }
    

    public Long getId(){
        return id;
    }
    public void setId(Long i){
        this.id=i;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name=n;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String e){
        this.email=e;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
