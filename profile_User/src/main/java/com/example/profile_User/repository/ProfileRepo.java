package com.example.profile_User.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.profile_User.entity.Profile;

public interface ProfileRepo extends JpaRepository<Profile,Long> {
    
}
