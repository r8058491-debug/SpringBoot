package com.example.libraryApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.libraryApp.entity.Library;

public interface LibraryRepo extends JpaRepository<Library,Long> {
	List<Library> findByTitle(String title);
	List<Library> findByAuthor(String author);
	List<Library> findByBorrow(Integer borrow);
}
