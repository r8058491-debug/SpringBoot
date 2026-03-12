package com.example.customer_wallet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer_wallet.entity.Customer;
import com.example.customer_wallet.service.CustomerService;

@RestController
@RequestMapping("/bank")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer customer) {
        return service.createCustomer(customer);
    }

    @GetMapping("/getall")
    public List<Customer> getAllCustomer() {
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Customer> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/update")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        return service.updateCustomer(id, customer);
    }

    @PutMapping("/update/{balance}")
    public Customer updateCustomerBalance(@PathVariable Long id, @RequestBody double balance) {
        return service.updateCustomerBalance(id, balance);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCustomerById(@PathVariable Long id) {
        service.deleteCustomer(id);
        return "Deleted Sir....";
    }
}
