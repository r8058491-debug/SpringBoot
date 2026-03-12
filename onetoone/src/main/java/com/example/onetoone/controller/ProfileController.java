package com.example.onetoone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetoone.entity.User;
import com.example.onetoone.service.ProfileService;

@RestController
@RequestMapping("/p")
public class ProfileController {

    @Autowired
    private ProfileService service;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @GetMapping("/getall")
    public List<User> getByAllUser() {
        return service.getByAllUser();
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id,@RequestBody User user){
        return service.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
        return "Deleted Successfully";
    }

}
