package com.example.onlineexamsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineexamsystem.dto.StudentResultDto;
import com.example.onlineexamsystem.entity.School;
import com.example.onlineexamsystem.service.StudentService;

@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private StudentService service;

    @PostMapping
    public StudentResultDto createSchool(@RequestBody School school){
        return service.createSchool(school);
    }

    @GetMapping("/get")
    public List<StudentResultDto> getAll(){
        return service.getSchoolAll();
    }
    
    @DeleteMapping("/{id}")
    public String deleteSchool(@PathVariable Long id){
        return service.deleteSchoolById(id);
    }
}
