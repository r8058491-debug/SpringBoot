package com.example.onlineexamsystem.dto;

public class StudentRequestDto {

    String studentName;
    int mathMarks;
    int scienceMarks;
    int englishMarks;
    Long schoolId;

    public StudentRequestDto(){}

    public StudentRequestDto(String studentName,int m,int s,int e,Long id){
        this.studentName=studentName;
        this.mathMarks=m;
        this.scienceMarks=s;
        this.englishMarks=e;
        this.schoolId=id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    
    
}
