package com.example.student_idcard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student_idcard.entity.Student;
import com.example.student_idcard.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    private StudentRepo repo;

    public Student createStudent(Student student) {
        return repo.save(student);
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public Optional<Student> getById(Long id) {
        return repo.findById(id);
    }

    public void DeleteByName(String name) {
        repo.deleteByName(name);
    }

    public Student updateStudent(Long id, Student student) {
        Student s = repo.findById(id).orElseThrow(null);

        s.setName(student.getName());
        s.setStandard(student.getStandard());
        s.setId_card(student.getId_card());
        return repo.save(s);
    }

    public void deleteStudent(Long id) {
        repo.deleteById(id);
        System.out.println("Deleted Successfully...");
    }

    public void deleteStudentByName(String name) {
        repo.deleteByName(name);
        System.out.println("Delete");
    }

}
