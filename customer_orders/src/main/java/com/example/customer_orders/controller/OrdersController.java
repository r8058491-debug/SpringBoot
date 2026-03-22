package com.example.customer_orders.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer_orders.entity.Orders;
import com.example.customer_orders.service.CustomerService;
@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private CustomerService oservice;

    @GetMapping("/get/{id}")
    public Optional<Orders> getOrdersById(@PathVariable Long id) {
        return oservice.getOrderById(id);
    }

    @PutMapping("/update/{id}")
    public Orders updateOrders(@PathVariable Long id, @RequestBody Orders orders) {
        return oservice.updateOrder(id, orders);
    }

}
