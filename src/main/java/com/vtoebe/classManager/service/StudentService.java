package com.vtoebe.classManager.service;

import com.vtoebe.classManager.model.Student;
import com.vtoebe.classManager.request.StudentRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StudentService {
    public Student createStudent(StudentRequest studentRequest) {
        return new Student(
                UUID.randomUUID(),
                studentRequest.getName(),
                studentRequest.getClassName(),
                studentRequest.getEmail(),
                studentRequest.getPassword());
    }
}
