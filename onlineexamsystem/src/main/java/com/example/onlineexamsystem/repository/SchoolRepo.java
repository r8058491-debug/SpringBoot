package com.example.onlineexamsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlineexamsystem.entity.School;

@Repository
public interface SchoolRepo extends JpaRepository<School,Long>{
    
}
