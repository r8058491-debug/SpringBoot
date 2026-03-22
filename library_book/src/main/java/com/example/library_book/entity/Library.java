package com.example.library_book.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Library {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String location;

    @OneToMany(mappedBy="library",cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true)
    @JsonManagedReference
    private List<Books> books=new ArrayList<>();

    public Library(){}

    public Library(String l){
        this.location=l;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setOrder(List<Books> books) {
        this.books = books;
    }

    
}
