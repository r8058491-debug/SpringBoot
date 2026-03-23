package com.example.teacher_courses.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Teacher{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    String teacherName;
    int experience;
    String subject;
    @OneToMany(mappedBy="teacher",cascade=CascadeType.ALL)
    @JsonManagedReference
    List<Courses> courses=new ArrayList<>();

    public Teacher(){}

    public Teacher(String tn,int e,String s){
        this.teacherName=tn;
        this.experience=e;
        this.subject=s;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    public Long getId() {
        return id;
    }

}