package com.example.customer_orders.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer_orders.entity.Customer;
import com.example.customer_orders.entity.Orders;
import com.example.customer_orders.repository.CustomerRepo;
import com.example.customer_orders.repository.OrdersRepo;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo repo;

    @Autowired
    private OrdersRepo orepo;

    public Customer createCustomer(Customer customer) {
        List<Orders> orders = customer.getOrder();

        for (Orders o : orders) {
            o.setCustomer(customer);
        }
        return repo.save(customer);
    }

    public List<Customer> getAlls() {
        return repo.findAll();
    }

    public Optional<Customer> getCustomerById(Long id) {
        return repo.findById(id);
    }

    public Customer updateCustomerName(Long id, Customer customer) {
        Customer c = repo.findById(id).orElseThrow(() -> new RuntimeException("Error Aa gya :" + id));
        c.setCustomerName(customer.getCustomerName());
        return repo.save(c);
    }

    public Customer updateCustomerEmail(Long id, Customer customer) {
        Customer cu = repo.findById(id).orElseThrow(() -> new RuntimeException("Error hai bro :" + id));
        cu.setCustomerEmail(customer.getCustomerEmail());
        return repo.save(cu);
    }

    public Customer updateCustomerCountry(Long id, Customer customer) {
        Customer cus = repo.findById(id).orElseThrow(() -> new RuntimeException("Error yeh bhi hai :" + id));
        cus.setCountry(customer.getCountry());
        return repo.save(cus);
    }

    public void deleteCustomer(Long id) {
        repo.findById(id);
        System.out.println("Deleted Successfully..");
    }

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
