package com.example.onetoone.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetoone.entity.Profile;

public interface ProfileRepo extends JpaRepository<Profile, Long> {

}