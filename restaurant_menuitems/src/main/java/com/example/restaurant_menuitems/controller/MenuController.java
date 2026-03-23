package com.example.restaurant_menuitems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant_menuitems.entity.Menu;
import com.example.restaurant_menuitems.service.RestaurantService;

@RestController
@RequestMapping("/menuitems")

public class MenuController{

    @Autowired
    private RestaurantService service;

    @GetMapping
    public List<Menu> getAll(){
        return service.getAlls();
    }

    @PutMapping("/{id}")
    public Menu updatePrice(@PathVariable Long id,@RequestBody Menu menu){
        return service.updatePrice(id,menu);
    }

    @DeleteMapping("/{id}")
    public String deleteMenu(@PathVariable Long id){
        return service.deleteMenu(id);
    }



}