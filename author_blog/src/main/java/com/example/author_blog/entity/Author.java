package com.example.author_blog.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="author_id")
    private Long id;

    private String authorName;
    
    @OneToMany(mappedBy="author",cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true)
    @JsonManagedReference
    private List<Posts> posts=new ArrayList<>();

    public Author(){}

    public Author(String n){
        this.authorName=n;
    }

    public Long getId() {
        return id;
    }

   

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public List<Posts> getPosts() {
        return posts;
    }

    public void setPosts(List<Posts> posts) {
        this.posts = posts;
    }
    

}
