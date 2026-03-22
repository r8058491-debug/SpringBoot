package com.example.library_book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library_book.entity.Books;
import com.example.library_book.entity.Library;
import com.example.library_book.repository.*;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepo lrepo;
    
    @Autowired
    private BooksRepo brepo;

    public Library createLibrary(Library library){
        List<Books> books=library.getBooks();
            for(Books b:books){
                b.setLibrary(library);
            }
        return lrepo.save(library);
    }

    public List<Library> getAll(){
        return lrepo.findAll();
    }

    public Books updateBooks(Long id, Books books){
        Books b=brepo.findById(id).orElseThrow(()-> new RuntimeException("Error aaya :"+id));
        b.setBookName(books.getBookName());
        b.setTitle(books.getTitle());
        b.setType(books.getType());
        return brepo.save(b);
    }

    public Optional<Books> getBooksById(Long id){
        return brepo.findById(id);
    }

    public Optional<Library> getLibraryById(Long id){
        return lrepo.findById(id);
    }

    public List<Books> getAllBooks(){
        return brepo.findAll();
    }

    public List<Library> getAllLibrary(){
        return lrepo.findAll();
    }


    public void deleteBook(Long id){
        brepo.deleteById(id);
        System.out.println("Deleted Successfully.....");
    }
}
