package com.example.teacher_courses.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teacher_courses.entity.Courses;
import com.example.teacher_courses.entity.Teacher;
import com.example.teacher_courses.repository.CoursesRepo;
import com.example.teacher_courses.repository.TeacherRepo;

@Service
public class TeacherService{

    @Autowired
    private CoursesRepo crepo;
    
    @Autowired
    private TeacherRepo trepo;


    public Teacher createTeacher(Teacher teacher){
        List<Courses> c=teacher.getCourses();
        for(Courses co:c){
            co.setTeacher(teacher);
        }
        return trepo.save(teacher);
    }

    public List<Courses> getAll(){
        return crepo.findAll();
    }

    public Courses updateCourse(Long id,Courses courses){
        Courses c=crepo.findById(id).orElseThrow(()-> new RuntimeException("Error aa gya bhai!"+id));
        c.setCourseName(courses.getCourseName());
        c.setDuration(courses.getDuration());
        c.setType(courses.getType());
        return crepo.save(c);
    }

    public String deleteCourse(Long id){
        crepo.deleteById(id);
        return "Deleted Successfully";
    }

}