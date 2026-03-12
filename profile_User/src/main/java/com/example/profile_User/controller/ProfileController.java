package com.example.profile_User.controller;

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

import com.example.profile_User.entity.Profile;
import com.example.profile_User.service.ProfileService;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileService service;

    @PostMapping("/create")
    public Profile createProfile(@RequestBody Profile profile) {
        return service.createProfile(profile);
    }

    @GetMapping("/getAll")
    public List<Profile> getByProfile() {
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Profile> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Profile updateProfile(@PathVariable Long id, @RequestBody Profile profile) {
        return service.updateProfile(id, profile);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProfile(@PathVariable Long id) {
        service.deleteByProfileId(id);
        return "Deleted Successfully";
    }

}
