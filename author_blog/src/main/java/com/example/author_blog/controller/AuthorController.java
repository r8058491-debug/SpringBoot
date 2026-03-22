package com.example.author_blog.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.author_blog.entity.Author;

import com.example.author_blog.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService service;

    @PostMapping("/create")
    public Author createAuthor(@RequestBody Author author) {
        return service.createAuthor(author);
    }

    @GetMapping
    public List<Author> getAll(){
        return service.getAlls();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAuthor(@PathVariable Long id){
        return service.deleteAuthor(id);
    }


    

}
