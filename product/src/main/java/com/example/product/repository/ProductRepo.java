package com.example.product.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.product.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
    Optional<Product> findByProductName(String productName);
    Product findByExpiryDate(String expiryDate);
}
