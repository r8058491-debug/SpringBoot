package com.example.doctor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doctor.entity.Doctor;

import com.example.doctor.repository.DoctorRepository;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repository;

    public Doctor saveDoctor(Doctor doctor) {
        return repository.save(doctor);
    }

    public List<Doctor> getAllDoctors() {
        return repository.findAll();
    }

    public Optional<Doctor> getDoctorById(Long id) {
        return repository.findById(id);
    }

    public Doctor updateDoctor(Long id, Doctor doctor) {
        Doctor dr = repository.findById(id).orElseThrow(null);
        dr.setName(doctor.getName());
        dr.setSpecialization(doctor.getSpecialization());
        dr.setExperience(doctor.getExperience());
        return repository.save(dr);
    }

    public List<Doctor> getDoctorByName(String name){
        return repository.findByName(name);
    }

    public void deleteDoctor(Long id) {
        repository.deleteById(id);
        System.out.println("Doctor deleted successfully!");
    }

}
