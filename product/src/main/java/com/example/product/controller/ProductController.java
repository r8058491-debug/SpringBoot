package com.example.product.controller;

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
import com.example.product.entity.Product;
import com.example.product.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product createProduct(@RequestBody Product products) {
        return service.saveProduct(products);
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/get/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return service.getProductById(id);
    }

    @GetMapping("/get/{productName}")
    public Optional<Product> getProductByName(@PathVariable String productName) {
        return service.getProductByName(productName);
    }

    @GetMapping("/{expiryDate}")
    public Product getProductByExpiryDate(@PathVariable String expiryDate){
        return service.getProductByExpiryDate(expiryDate);
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product products) {
        return service.updateProduct(id, products);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        service.deleteProduct(id);
        return "Delete Successfully";
    }

}
