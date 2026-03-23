package com.example.restaurant_menuitems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant_menuitems.entity.Restaurant;
import com.example.restaurant_menuitems.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")

public class RestaurantController{

    @Autowired
    private RestaurantService service;

    @PostMapping
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant){
        return service.createRestaurant(restaurant);
    }

    @GetMapping
    public List<Restaurant> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Restaurant getMenuItems(@PathVariable Long id){
        return service.getMenuItems(id);
    }

    // @PutMapping("/update/{id}")
    // public Restaurant updatePrice(@PathVariable Long id,@RequestBody Restaurant restaurant){
    //     return service.updatePrice(id, restaurant);
    // }


    @DeleteMapping("/delete/{rid}/{mid}")
    public String deleteMenu(@PathVariable Long rid,@PathVariable Long mid){
        service.deleteMenuFromRestaurant(rid, mid);
        return "Delete ho gya...";
    }
}