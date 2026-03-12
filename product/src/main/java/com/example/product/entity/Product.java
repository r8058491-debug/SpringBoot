package com.example.product.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private String expiryDate;

    public Product() {

    }

    public Product(String p, String e) {
        this.productName = p;
        this.expiryDate = e;
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setProductId(Long id) {
        this.productId = id;
    }

    public void setProductName(String n) {
        this.productName = n;
    }

    public void setExpiryDate(String e) {
        this.expiryDate = e;
    }

}
