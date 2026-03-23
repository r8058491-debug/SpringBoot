package com.example.teacher_courses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teacher_courses.entity.Courses;
import com.example.teacher_courses.service.TeacherService;

@RestController
@RequestMapping("/courses")
public class CoursesController{

    @Autowired
    private TeacherService service;

    @GetMapping("/getAll")
    public List<Courses> getAllCourses(){
        return service.getAll();
    }

    @PutMapping("/update/{id}")
    public Courses updateCourse(@PathVariable Long id, @RequestBody Courses courses){
        return service.updateCourse(id, courses);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCourses(@PathVariable Long id){
        service.deleteCourse(id);
        return "Deleted";
    }

}