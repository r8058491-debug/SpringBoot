package com.example.doctor.dto;

public class DoctorDto {

   Long id;
   String name;
   String specialization;

    public DoctorDto(){}

    public DoctorDto(Long id,String name,String specialization){
        this.id=id;
        this.name=name;
        this.specialization=specialization;
    }

    public Long getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    
}
