package com.example.restaurant_menuitems.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Restaurant{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String restaurantName;

    @OneToMany(mappedBy="restaurant",cascade=CascadeType.ALL,fetch= FetchType.EAGER,orphanRemoval=true)
    @JsonManagedReference   // parent ka data child mein jaayega yeh dikhega
    private List<Menu> menu=new ArrayList<>();

    public Restaurant(){}

    public Restaurant(String r){
        this.restaurantName=r;
    }

    public Long getId() {
        return id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    } 

    
}