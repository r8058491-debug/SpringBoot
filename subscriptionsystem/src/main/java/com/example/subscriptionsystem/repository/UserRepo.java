package com.example.subscriptionsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.subscriptionsystem.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long>{
    
}
