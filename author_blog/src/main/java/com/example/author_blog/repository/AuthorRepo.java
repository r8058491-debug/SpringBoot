package com.example.author_blog.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.author_blog.entity.Author;


public interface AuthorRepo extends JpaRepository<Author,Long> {
    public Author findByAuthorName(String name);
}
