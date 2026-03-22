package com.example.customer_orders.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer_orders.entity.Customer;
import com.example.customer_orders.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;
    
    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer customer){
        return service.createCustomer(customer);
    }

    @GetMapping("/getall")
    public List<Customer> getAll(){
        return service.getAlls();
    }

    @GetMapping("/get/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Long id){
        return service.getCustomerById(id);
    }

}
