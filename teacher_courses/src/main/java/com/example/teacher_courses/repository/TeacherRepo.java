package com.example.teacher_courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.teacher_courses.entity.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Long>{

}