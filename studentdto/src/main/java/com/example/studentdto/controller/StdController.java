package com.example.studentdto.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentdto.dto.StdDto;
import com.example.studentdto.entity.Std;
import com.example.studentdto.service.StdService;

@RestController
@RequestMapping("/studentdetails")
public class StdController {

    private final StdService service;

    public StdController(StdService s){
        this.service=s;
    }

    @PostMapping("/create")

    public StdDto createStudent(@RequestBody Std std){
        return service.createStudent(std);
    }

    @GetMapping("/gett/{id}")

    public StdDto getStudentById(@PathVariable Long id){
        return service.getStudentById(id);
    }

    @GetMapping("/get/{name}")

    public StdDto getStudentByName(@PathVariable String name){
        return service.getStudentByName(name);
    }

    @PutMapping("/update/{id}")

    public StdDto updateStudent(@PathVariable Long id,@RequestBody Std student){
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/delete/{id}")

    public String deleteStudent(@PathVariable Long id){
        return service.deleteStudent(id);
    }
    
}
