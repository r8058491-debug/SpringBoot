package com.example.todo.controller;

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

import com.example.todo.entity.ToDo;
import com.example.todo.service.ToDoService;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    @Autowired
    private ToDoService service;

    @PostMapping
    public ToDo createToDo(@RequestBody ToDo todo) {
        return service.saveToDo(todo);
    }

    @GetMapping("/all")
    public List<ToDo> getToDo() {
        return service.getAllToDo();
    }

    @GetMapping("/{id}")
    public Optional<ToDo> getToDoById(@PathVariable Long id) {
        return service.getToDoById(id);
    }

    @GetMapping("/get/{completed}")
    public Optional<ToDo> getToDoByCompleted(@PathVariable Boolean completed) {
        return service.getToDoByCompleted(completed);

    }

    @PutMapping("/update/{id}")
    public ToDo updateToDoById(@PathVariable Long id, @RequestBody ToDo todo) {
        return service.updateToDo(id, todo);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteToDoById(@PathVariable Long id) {
        service.deleteToDoById(id);
        return "Delete ho gya bhai!!";
    }
}
