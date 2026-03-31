package com.example.onlineexamsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineexamsystem.dto.StudentRequestDto;
import com.example.onlineexamsystem.dto.StudentResultDto;
import com.example.onlineexamsystem.entity.Student;
import com.example.onlineexamsystem.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;
    

    @PostMapping
    public StudentResultDto createStudent(@RequestBody StudentRequestDto studentDto){
        return service.createStudent(studentDto);
    }

    @GetMapping("/get")
    public List<StudentResultDto> getAll(){
        return service.getStudentAll();
    }

    @GetMapping("/{id}")
    public StudentResultDto getById(@PathVariable Long id){
        return service.getStudentById(id);
    }

    @PutMapping("/{id}")
    public StudentResultDto updateStudent(@PathVariable Long id,@RequestBody Student student){
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")

    public String deleteStudent(@PathVariable Long id){
        return service.deleteStudent(id);
    }
}
