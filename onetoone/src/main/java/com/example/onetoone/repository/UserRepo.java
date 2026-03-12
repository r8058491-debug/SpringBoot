package com.example.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetoone.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}