package com.example.teacher_courses.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Courses{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    String courseName;
    int duration;
    String type;
    @ManyToOne
    @JsonBackReference
    Teacher teacher;

    public Courses(){}

    public Courses(String cn,int d,String t,Teacher teach){
        this.courseName=cn;
        this.type=t;
        this.duration=d;
        this.teacher=teach;
    }

    public String getCourseName() {
        return courseName;
    }
    

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Long getId() {
        return id;
    }


    
    
}