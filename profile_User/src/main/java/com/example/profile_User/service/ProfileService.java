package com.example.profile_User.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.profile_User.entity.Profile;
import com.example.profile_User.repository.ProfileRepo;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepo repo;

    public Profile createProfile(Profile profile) {
        return repo.save(profile);
    }

    public List<Profile> getAll() {
        return repo.findAll();
    }

    public Optional<Profile> getById(Long id) {
        return repo.findById(id);
    }


    public Profile updateProfile(Long id, Profile profile) {
        Profile p = repo.findById(id).orElseThrow(null);
        p.setPhone_number(profile.getPhone_number());
        p.setAddress(profile.getAddress());
        p.setDob(profile.getDob());
        p.setUser(profile.getUser());
        return repo.save(p);
    }

    

    public String deleteByProfileId(Long id) {
        repo.deleteById(id);
        return "Deleted....";
    }

}
