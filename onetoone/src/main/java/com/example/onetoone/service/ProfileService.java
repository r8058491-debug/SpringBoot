package com.example.onetoone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onetoone.entity.User;
import com.example.onetoone.repository.UserRepo;

@Service
public class ProfileService {

    @Autowired
    private UserRepo repo;

    public User createUser(User user) {
        return repo.save(user);
    }

    public List<User> getByAllUser() {
        return repo.findAll();
    }

    public Optional<User> getById(Long id) {
        return repo.findById(id);
    }

    public User updateUser(Long id, User user) {
        User p = repo.findById(id).orElseThrow(null);
        p.setId(user.getId());
        ;
        p.setName(user.getName());
        p.setEmail(user.getEmail());
        return repo.save(p);
    }

    public String deleteUser(Long id) {
        repo.deleteById(id);
        return "Deleted Successfully";
    }

}
