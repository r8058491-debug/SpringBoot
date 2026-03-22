package com.example.author_blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.author_blog.entity.Posts;
import com.example.author_blog.service.AuthorService;

@RestController
@RequestMapping("/posts")
public class PostsController {

    @Autowired
    private AuthorService service;


    @GetMapping()
    public List<Posts> getAll(){
        return service.getAll();
    }
    @GetMapping("/get/{name}")
    public List<Posts> getByAuthorName(@PathVariable String name) {
        return service.getPost(name);
    }

    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable Long id){
        return service.deletePosts(id);
    }

}
