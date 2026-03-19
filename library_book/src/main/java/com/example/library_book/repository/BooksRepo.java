package com.example.library_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library_book.entity.Books;

public interface BooksRepo extends JpaRepository<Books,Long>{
    
}
