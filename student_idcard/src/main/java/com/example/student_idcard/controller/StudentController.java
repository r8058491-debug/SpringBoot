package com.example.student_idcard.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student_idcard.entity.Student;
import com.example.student_idcard.service.StudentService;

@RestController
@RequestMapping("/studentid")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }

    @GetMapping("/getAll")
    public List<Student> getAll() {
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Student> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
        System.out.println("Deleted success.....");
    }

    @DeleteMapping("/{name}")
    public void deleteStudent(@PathVariable String name) {
        service.deleteStudentByName(name);
        System.out.println("Deleted By Name");
        
    }
}
