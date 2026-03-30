package com.example.doctor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doctor.dto.DoctorDto;
import com.example.doctor.entity.Doctor;

import com.example.doctor.repository.DoctorRepository;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repository;

    public DoctorDto createDoctor(Doctor doctor) {
        Doctor saved = repository.save(doctor);
        return convertToDto(saved);
    }

    private DoctorDto convertToDto(Doctor doctor) {
        return new DoctorDto(
                doctor.getId(),
                doctor.getName(),
                doctor.getSpecialization());
    }

    public List<Doctor> getByAll(){
        return repository.findAll();
    }

    public DoctorDto getDoctorById(Long id){
        Optional<Doctor> doctor=repository.findById(id);
        return doctor.map(this::convertToDto).orElse(null);
    }

    public DoctorDto updateDoctor(Long id, Doctor doctor){
        Optional<Doctor> d=repository.findById(id);

        if(d.isPresent()){
            Doctor doc=d.get();

            if(doctor.getId()!=null){
                doc.setId(doctor.getId());
            }

            if(doctor.getName()!=null){
                doc.setName(doctor.getName());
            }

            if(doctor.getSpecialization()!=null){
                doc.setSpecialization(doctor.getSpecialization());
            }

            Doctor updateDoctor =repository.save(doc);

            return convertToDto(updateDoctor);
        }
        return null;
    }

    public String deleteDoctor(Long id){
        repository.deleteById(id);
        return "Deleted Successfully";
    }

}
