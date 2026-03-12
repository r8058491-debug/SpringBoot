package com.example.student_idcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_idcard.entity.Id_card;

public interface I_cardRepo extends JpaRepository<Id_card,Long> {
    
}
