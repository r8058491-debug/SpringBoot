package com.example.libraryApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="libraryApp")
public class Library {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String author;
	private Integer borrow;
	
	public Library() {
		
	}
	
	public Library(String t,String a,Integer b) {
		this.title=t;
		this.author=a;
		this.borrow=b;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String t) {
		this.title=t;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String b) {
		this.author=b;
	}
	
	public Integer getBorrow() {
		return borrow;
	}
	
	public void setBorrow(Integer bt) {
		this.borrow=bt;
	}

}
