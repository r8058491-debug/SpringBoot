package com.example.profile_User.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.profile_User.entity.User;

public interface UserRepo  extends JpaRepository<User,Long> {

}
