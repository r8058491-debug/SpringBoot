package com.example.studentdto.dto;

public class StdDto {

    Long id;
    String name;
    int standard;

    public StdDto(){}

    public StdDto(Long id,String n,int s){
        this.id=id;
        this.name=n;
        this.standard=s;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    
    
}
