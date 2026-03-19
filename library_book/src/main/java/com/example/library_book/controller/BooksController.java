package com.example.library_book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library_book.entity.Books;
import com.example.library_book.service.LibraryService;


@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private LibraryService service;


    @GetMapping("/getAllBooks")
    public List<Books> getAllBooks(){
        return service.getAllBooks();
    }

    @GetMapping("/get/books/{id}")
    public Optional<Books> getBooksById(@PathVariable Long id){
        return service.getBooksById(id);
    }

    @PutMapping("/update/{id}")
    public Books updateBooks(@PathVariable Long id,@RequestBody Books books){
        return service.updateBooks(id, books);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteBooks(@PathVariable Long id){
        service.deleteBook(id);
        System.out.println("Deleted Complete yr!!!");
    }
}
