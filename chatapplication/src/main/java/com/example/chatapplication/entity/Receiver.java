package com.example.chatapplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Receiver {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="receiver_id")
    Long id;

    String name;

    public Receiver(){}

    public Receiver(String n){
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
