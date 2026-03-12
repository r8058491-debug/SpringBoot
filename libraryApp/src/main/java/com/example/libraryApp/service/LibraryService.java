package com.example.libraryApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libraryApp.entity.Library;
import com.example.libraryApp.repository.LibraryRepo;

@Service
public class LibraryService {
	@Autowired
	private LibraryRepo repo;

	public Library createLibrary(Library library) {
		return repo.save(library);
	}

	public List<Library> getAllLibrary() {
		return repo.findAll();
	}

	public Optional<Library> getById(Long id) {
		return repo.findById(id);
	}

	public List<Library> getByTitle(String title) {
		return repo.findByTitle(title);
	}

	public List<Library> getByAuthor(String author) {
		return repo.findByAuthor(author);
	}

	public List<Library> getByBorrow(Integer borrow) {
		return repo.findByBorrow(borrow);
	}

	public Library updateLibrary(Long id, Library library) {
		Library t = repo.findById(id).orElseThrow(null);
		t.setId(library.getId());
		t.setTitle(library.getTitle());
		t.setAuthor(library.getAuthor());
		t.setBorrow(library.getBorrow());
		return repo.save(t);
	}

	public void deleteLibraryById(Long id) {
		repo.deleteById(id);
		System.out.println("Deleted Bro!!");
	}

}
