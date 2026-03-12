package com.example.customer_wallet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer_wallet.entity.Customer;
import com.example.customer_wallet.entity.Wallet;
import com.example.customer_wallet.repository.CustomerRepo;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo repo;

    public Customer createCustomer(Customer customer) {
        return repo.save(customer);
    }

    public List<Customer> getAll() {
        return repo.findAll();
    }

    public Optional<Customer> getById(Long id) {
        return repo.findById(id);
    }

    public Customer updateCustomer(Long id, Customer customer) {
        Customer c = repo.findById(id).orElseThrow(null);
        c.setCustomer_name(customer.getCustomer_name());
        c.setMobile_number(customer.getMobile_number());
        c.setWallet(customer.getWallet());
        return repo.save(c);
    }

    public Customer updateCustomerBalance(Long id, double balance) {

        Customer cu = repo.findById(id).orElseThrow(null);
        Wallet wallet = cu.getWallet();
        wallet.setBalance(balance);
        return repo.save(cu);
    }

    public String deleteCustomer(Long id){
        repo.deleteById(id);
        return "Deleted Successfully...";

    }

}
