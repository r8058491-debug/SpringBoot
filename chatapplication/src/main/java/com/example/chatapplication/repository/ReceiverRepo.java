package com.example.chatapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.chatapplication.entity.Receiver;

@Repository
public interface ReceiverRepo extends JpaRepository<Receiver,Long>{
    
}
