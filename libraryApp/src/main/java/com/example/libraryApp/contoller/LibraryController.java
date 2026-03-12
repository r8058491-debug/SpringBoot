package com.example.libraryApp.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.libraryApp.entity.Library;
import com.example.libraryApp.service.LibraryService;

@RestController
@RequestMapping("/libraryApp")
public class LibraryController {

	@Autowired
	private LibraryService service;

	@PostMapping
	public Library createLibrary(@RequestBody Library library) {
		return service.createLibrary(library);
	}

	@GetMapping("/get")
	public List<Library> getLibrary() {
		return service.getAllLibrary();
	}

	@GetMapping("/{id}")
	public Optional<Library> getById(@PathVariable Long id) {
		return service.getById(id);
	}

	@GetMapping("/title/{title}")
	public List<Library> getByTitle(@PathVariable String title) {
		return service.getByTitle(title);
	}

	@GetMapping("/author/{author}")
	public List<Library> getByAuthor(@PathVariable String author) {
		return service.getByAuthor(author);
	}

	@GetMapping("/limit/{borrow}")
	public List<Library> getByBorrow(@PathVariable Integer borrow) {
		return service.getByBorrow(borrow);
	}

	@PutMapping("/update/{id}")
	public Library updateLibraryById(Long id, @RequestBody Library library) {
		return service.updateLibrary(id, library);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteLibraryById(@PathVariable Long id) {
		service.deleteLibraryById(id);
		System.out.println("Deleted Successfully Ab New Insert Kar le...");
	}

}
