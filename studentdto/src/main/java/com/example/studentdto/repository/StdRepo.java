package com.example.studentdto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentdto.entity.Std;
import java.util.Optional;


@Repository
public interface StdRepo extends JpaRepository<Std,Long>{

    public Optional<Std> findByName(String name);
    
}
