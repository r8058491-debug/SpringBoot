package com.example.subscriptionsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.subscriptionsystem.dto.RequestDto;
import com.example.subscriptionsystem.dto.ResponseDto;
import com.example.subscriptionsystem.entity.SubscriptionApp;
import com.example.subscriptionsystem.entity.User;
import com.example.subscriptionsystem.service.SubscriptionAppService;

@RestController
@RequestMapping("/subscribe")
public class SubscriptionController {

    @Autowired
    private SubscriptionAppService service;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto>createSubscription(@RequestBody RequestDto dto){
        ResponseDto response=service.takeSubscription(dto);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/user/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.ok(service.createUser(user));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ResponseDto>> getAllSubscription(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getSubscriptionById(@PathVariable Long id){
        return ResponseEntity.ok(service.getSubscriptionById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseDto> updateSubscription(@PathVariable Long id, @RequestBody SubscriptionApp app){
        return ResponseEntity.ok(service.updateSubscription(id, app));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> cancelSubscription(@PathVariable Long id){
        return ResponseEntity.ok(service.cancelSubscription(id));
    }

    
    
}
