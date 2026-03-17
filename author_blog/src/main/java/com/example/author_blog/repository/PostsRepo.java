package com.example.author_blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.author_blog.entity.Posts;

public interface PostsRepo extends JpaRepository<Posts,Long>{
    
}
