package com.example.todo.repository;

 import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todo.entity.ToDo;

public interface ToDoRepo extends JpaRepository<ToDo, Long> {
    public Optional<ToDo> findByCompleted(Boolean completed); 

}
