package com.example.dtoexample.dto;

public class Employeedto {

    private Long id;

    private String name;
    private String email;

    public Employeedto(){}

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employeedto(Long id,String n,String e){
        this.id=id;
        this.name=n;
        this.email=e;
    }

    
    
}
