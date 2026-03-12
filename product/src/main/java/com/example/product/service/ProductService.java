package com.example.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repository;

    public Product saveProduct(Product products) {
        return repository.save(products);
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return repository.findById(id);
    }

    public Optional<Product> getProductByName(String productName) {
        return repository.findByProductName(productName);
    }

    public Product getProductByExpiryDate(String expiryDate){
        return repository.findByExpiryDate(expiryDate);
    }

    public Product updateProduct(Long id, Product products) {
        Product rd = repository.findById(id).orElseThrow(null);
        rd.setProductName(products.getProductName());
        rd.setProductId(products.getProductId());
        rd.setExpiryDate(products.getExpiryDate());
        return repository.save(rd);
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
        System.out.println("Delete Permanently...");
    }

}
