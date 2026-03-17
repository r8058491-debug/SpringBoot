package com.example.author_blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.author_blog.repository.AuthorRepo;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepo repo;
    
 
}
