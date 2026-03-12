package com.example.aadharcard.controller;

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

import com.example.aadharcard.entity.User;
import com.example.aadharcard.service.UserService;

@RestController
@RequestMapping("/aadharcard")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @GetMapping("/getall")
    public List<User> getAll(){
        return service.getAllUser();
    }

    @GetMapping("/get/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return service.getByUserId(id);
    }


    @PutMapping("/update/{id}")
    public User updateUser(@RequestBody User user,@PathVariable Long id){
        return service.updateUser(id, user);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@PathVariable Long id){
        service.deleteAllById(id);

        System.out.println("Deleted...");
    }


}
