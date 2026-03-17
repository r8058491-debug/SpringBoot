package com.example.customer_orders.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long customer_id;

    private String customerName;
    private String customerEmail;
    private String country;

    @OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
    private List<Orders> order=new ArrayList<>();

    public Customer(){}

    public Customer(String n,String e,String p,String c){
        this.customerName=n;
        this.customerEmail=e;
        this.country=c;
    }

    public Long getId() {
        return customer_id;
    }

    public void setId(Long id) {
        this.customer_id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Orders> getOrder() {
        return order;
    }

    public void setOrder(List<Orders> order) {
        this.order = order;
    }

}
