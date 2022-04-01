package com.vtoebe.classManager.service;

import com.vtoebe.classManager.model.Student;
import com.vtoebe.classManager.request.StudentRequest;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public Student createStudent(StudentRequest studentRequest) {
        return new Student(studentRequest);
    }
}
