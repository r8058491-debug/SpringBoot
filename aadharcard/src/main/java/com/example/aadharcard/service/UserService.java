package com.example.aadharcard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aadharcard.entity.User;
import com.example.aadharcard.repository.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public User createUser(User user){
        return repo.save(user);
    }

    public List<User> getAllUser(){
        return repo.findAll();
    }

    public Optional<User> getByUserId(Long id){
        return repo.findById(id);
    }
    public Optional<User> getByUserName(String name){
        return repo.findByName(name);
    }

    public User updateUser(Long id,User user){
        User u=repo.findById(id).orElseThrow(null);
        u.setName(user.getName());
        u.setAadhar(user.getAadhar());
        u.setAge(user.getAge());
        u.setTel(user.getTel());
        return repo.save(u);
    }

    public User updateUserName(Long id,User user){
        User nam=repo.findById(id).orElseThrow(null);
        nam.setName(user.getName());
        return repo.save(nam);
    }

    public void deleteAllById(Long id){
        repo.deleteById(id);
        System.out.println("Deleted Successfully");
    }
}
