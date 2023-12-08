package com.example.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Student;
import com.example.repo.StudentRepo;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public void addStudent(Student student) {
        studentRepo.save(student);
    }
    @Override
    public List < Student > getTheListStudent() {
        return studentRepo.findAll();
    }
}