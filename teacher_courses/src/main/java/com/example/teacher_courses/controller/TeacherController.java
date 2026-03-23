package com.example.teacher_courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teacher_courses.entity.Teacher;
import com.example.teacher_courses.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController{

    @Autowired
    private TeacherService service;

    @PostMapping("/create")
    public Teacher createTeacherWithCourses(@RequestBody Teacher teacher){
        return service.createTeacher(teacher);
    }



}