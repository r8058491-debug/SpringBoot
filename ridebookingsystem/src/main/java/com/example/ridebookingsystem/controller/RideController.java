package com.example.ridebookingsystem.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ridebookingsystem.dto.RequestDto;
import com.example.ridebookingsystem.dto.ResponseDto;
import com.example.ridebookingsystem.entity.Driver;
import com.example.ridebookingsystem.entity.User;
import com.example.ridebookingsystem.service.RideService;

@RestController
@RequestMapping("/ride")
public class RideController {

    @Autowired
    private RideService service;
    
    @PostMapping("/create")
    public ResponseEntity<ResponseDto> bookRide(@RequestBody RequestDto dto){
        ResponseDto response=service.bookRide(dto);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/drivers")
    public ResponseEntity<Driver> createDriver(@RequestBody Driver driver){
        Driver response=service.createDriver(driver);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.ok(service.createUser(user));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ResponseDto>> getAllRide(){
        return ResponseEntity.ok(service.getAllRide());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getRideById(@PathVariable Long id){
        return ResponseEntity.ok(service.getRideById(id));
    }

    @PutMapping("/{id}/surge")
    public ResponseEntity<ResponseDto> updateRide(@PathVariable Long id, @RequestParam int surgeMultiplier){
        return ResponseEntity.ok(service.updateRide(id, surgeMultiplier));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> cancelRide(@PathVariable Long id){
        return ResponseEntity.ok(service.cancelRide(id));
    }
}
