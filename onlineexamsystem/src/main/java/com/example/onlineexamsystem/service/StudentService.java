package com.example.onlineexamsystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineexamsystem.dto.StudentRequestDto;
import com.example.onlineexamsystem.dto.StudentResultDto;
import com.example.onlineexamsystem.entity.School;
import com.example.onlineexamsystem.entity.Student;
import com.example.onlineexamsystem.repository.SchoolRepo;
import com.example.onlineexamsystem.repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private SchoolRepo srepo;
    
    @Autowired
    private StudentRepo strepo;



    public StudentResultDto createStudent(StudentRequestDto request){
        School school=srepo.findById(request.getSchoolId()).orElseThrow(null);

        Student student=new Student();
        student.setStudentName(request.getStudentName());
        student.setMathMarks(request.getMathMarks());
        student.setScienceMarks(request.getScienceMarks());
        student.setEnglishMarks(request.getEnglishMarks());
        student.setSchool(school);
        Student saved=strepo.save(student);

        return convertStudentToDto(saved);
    }

    public StudentResultDto createSchool(School school){
        School sa=srepo.save(school);

        return convertSchoolToDto(sa);
    }

    public StudentResultDto getStudentById(Long id){
        Student student=strepo.findById(id).orElseThrow(()-> new RuntimeException("Error hai bhai "+id));

        return convertStudentToDto(student);
    }


    public List<StudentResultDto> getStudentAll(){
        List<Student> studentlist=strepo.findAll();
        List<StudentResultDto> list=new ArrayList<>();

        for(Student s:  studentlist){
            list.add(convertStudentToDto(s));
        }
        return list;
    } 

    public List<StudentResultDto> getSchoolAll(){
        List<School> schoollist=srepo.findAll();
        List<StudentResultDto> li=new ArrayList<>();

        for(School sc:schoollist){
            li.add(convertSchoolToDto(sc));
        }
        return li;
    }


    public StudentResultDto updateStudent(Long id,Student student){
        Student st=strepo.findById(id).orElseThrow(()-> new RuntimeException("Id Not Found"+id));

        st.setEnglishMarks(student.getEnglishMarks());
        st.setMathMarks(student.getMathMarks());
        st.setScienceMarks(student.getScienceMarks());

        Student saved=strepo.save(st);

        return convertStudentToDto(saved);
    }

    public String deleteStudent(Long id){
        strepo.deleteById(id);
        return "Deleted Successfully";
    }

    public String deleteSchoolById(Long id){
        srepo.deleteById(id);
        return "Deleted Successfully";
    }



    private StudentResultDto convertStudentToDto(Student student){
        StudentResultDto dto=new StudentResultDto();
        dto.setSchoolId(student.getSchool().getId());
        dto.setSchoolName(student.getSchool().getName());
        dto.setStudentName(student.getStudentName());

        int total=student.getEnglishMarks()+student.getMathMarks()+student.getScienceMarks();

        dto.setTotalMarks(total);

        double percentage=(total/300.00)*100;
        dto.setPercentage(percentage);

        if(percentage>=90){
            dto.setGrade("A");
        }else if(percentage>=75){
            dto.setGrade("B");
        }else if(percentage>=60){
            dto.setGrade("C");
        }else if(percentage>=33){
            dto.setGrade("D");
        }else{
            dto.setGrade("Fail");
        }

        return dto;
    }

        
    private StudentResultDto convertSchoolToDto(School school){
        StudentResultDto d=new StudentResultDto();
        d.setSchoolId(school.getId());
        d.setSchoolName(school.getName());

        return d;
    }
    
}
