package com.example.customer_orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.customer_orders.entity.Orders;

public interface OrdersRepo extends JpaRepository<Orders,Long>{
    
}
