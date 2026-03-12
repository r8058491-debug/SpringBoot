package com.example.customer_wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.customer_wallet.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Long>{
    
}
