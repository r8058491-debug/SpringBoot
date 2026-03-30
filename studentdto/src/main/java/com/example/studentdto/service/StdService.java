package com.example.studentdto.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.studentdto.dto.StdDto;
import com.example.studentdto.entity.Std;
import com.example.studentdto.repository.StdRepo;

@Service
public class StdService {

    private final StdRepo repo;

    public StdService(StdRepo st) {
        this.repo = st;
    }

    public StdDto createStudent(Std student) {
        Std saved = repo.save(student);
        return convertToDto(saved);
    }

    private StdDto convertToDto(Std student) {
        return new StdDto(
                student.getId(),
                student.getName(),
                student.getStandard());
    }

    public StdDto getStudentById(Long id) {
        Optional<Std> st = repo.findById(id);
        return st.map(this::convertToDto).orElse(null);
    }

    public StdDto getStudentByName(String name) {
        Optional<Std> s = repo.findByName(name);

        return s.map(this::convertToDto).orElse(null);
    }

    public StdDto updateStudent(Long id, Std student) {
        Optional<Std> std = repo.findById(id);

        if (std.isPresent()) {
            Std st = std.get();

            if (student.getId() != null) {
                st.setId(student.getId());
            }

            if (student.getName() != null) {
                st.setName(student.getName());
            }

            if (student.getStandard() != 0) {
                st.setStandard(student.getStandard());
            }

            Std savedStudent = repo.save(st);

            return convertToDto(savedStudent);
        }

        return null;
    }

    public String deleteStudent(Long id) {
        repo.deleteById(id);

        return "Deleted Successfully";
    }

}