package com.example.todo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.entity.ToDo;
import com.example.todo.repository.ToDoRepo;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepo repo;

    public ToDo saveToDo(ToDo todo) {
        return repo.save(todo);
    }

    public List<ToDo> getAllToDo() {
        return repo.findAll();
    }

    public Optional<ToDo> getToDoById(Long id) {
        return repo.findById(id);
    }

    public Optional<ToDo> getToDoByCompleted(Boolean completed){
        return repo.findByCompleted(completed);
    }
    public ToDo updateToDo(Long id, ToDo todo) {
        ToDo t = repo.findById(id).orElseThrow(null);
        t.setTitle(todo.getTitle());
        t.setDescription(todo.getDescription());
        t.setCompleted(todo.getCompleted());
        return repo.save(t);
    }

    public String deleteToDoById(Long id) {
        repo.deleteById(id);
        return "Deleted Successfully";
    }
}
