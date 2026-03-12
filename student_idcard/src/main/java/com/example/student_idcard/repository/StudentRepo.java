package com.example.student_idcard.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_idcard.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long> {
    public void deleteByName(String name);
}
