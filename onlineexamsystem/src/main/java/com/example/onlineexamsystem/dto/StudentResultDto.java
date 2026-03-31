package com.example.onlineexamsystem.dto;


public class StudentResultDto {
    String schoolName;
    String studentName;
    int totalMarks;
    double percentage;
    String grade;
    Long schoolId;

    public StudentResultDto(){}

    public StudentResultDto(String s,String sn,int t,double p,String g,Long i){
        this.schoolName=s;
        this.studentName=sn;
        this.totalMarks=t;
        this.percentage=p;
        this.grade=g;
        this.schoolId=i;
    }

    
    
    public String getStudentName() {
        return studentName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    
    
}
