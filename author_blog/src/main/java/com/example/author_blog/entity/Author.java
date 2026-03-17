package com.example.author_blog.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long author_id;

    private String authorName;
    
    @OneToMany(mappedBy="author",cascade=CascadeType.ALL)
    private List<Posts> posts=new ArrayList<>();

    public Author(){}

    public Author(String n){
        this.authorName=n;
    }

    public Long getAuthor_Id() {
        return author_id;
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
