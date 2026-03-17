package com.example.customer_orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.customer_orders.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
    
}
