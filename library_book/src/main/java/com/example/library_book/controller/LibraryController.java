package com.example.library_book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library_book.entity.Library;
import com.example.library_book.service.LibraryService;

@RestController
@RequestMapping("/library")
public class LibraryController {


    @Autowired
    private LibraryService service;

    
    @PostMapping("/create")
    public Library createLibrary(@RequestBody Library library){
        return service.createLibrary(library);
    }

    @GetMapping("/getAllLibrary")
    public List<Library> getAll(){
        return service.getAllLibrary();
    }

    @GetMapping("/getLibrary/{id}")
    public Optional<Library> getLibraryById(@PathVariable Long id){
        return service.getLibraryById(id);
    }

    
}
