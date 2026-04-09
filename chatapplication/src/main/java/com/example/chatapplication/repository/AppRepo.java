package com.example.chatapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.chatapplication.entity.App;

@Repository
public interface AppRepo extends JpaRepository<App,Long>{
    
}
