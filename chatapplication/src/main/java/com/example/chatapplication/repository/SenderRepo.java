package com.example.chatapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.chatapplication.entity.Sender;

@Repository
public interface SenderRepo extends JpaRepository<Sender,Long>{
    
}
