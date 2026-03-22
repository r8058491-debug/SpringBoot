package com.example.customer_orders.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer_orders.entity.Orders;
import com.example.customer_orders.repository.OrdersRepo;

@Service
public class OrdersService{

    @Autowired
    private OrdersRepo orepo;
    

     public List<Orders> getAll(){
        return orepo.findAll();
    }
    public Optional<Orders> getOrderById(Long Id) {
        return orepo.findById(Id);
    }

    public Orders updateOrder(Long id,Orders orders){
        Orders o=orepo.findById(id).orElseThrow(() -> new RuntimeException("Error Hai bhai thik karle orders mein :"+id));
        o.setProductName(orders.getProductName());
        o.setPrice(orders.getPrice());
        return orepo.save(o);
    }

    public String deleteOrder(Long id) {
        orepo.deleteById(id);
        return "Deleted Successfully";
    }

}