package com.example.library_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library_book.entity.Library;

public interface LibraryRepo extends JpaRepository<Library,Long> {
    
}
