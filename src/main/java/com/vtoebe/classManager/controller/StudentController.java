package com.vtoebe.classManager.controller;

import com.vtoebe.classManager.model.Student;
import com.vtoebe.classManager.request.StudentRequest;
import com.vtoebe.classManager.response.StudentResponse;
import com.vtoebe.classManager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentResponse> createStudent(
            @RequestBody @Valid StudentRequest studentRequest,
            UriComponentsBuilder uriComponentsBuilder
            ){
        Student student = studentService.createStudent(studentRequest);

        URI uri = uriComponentsBuilder.path("/student/{id}").buildAndExpand(student.getId()).toUri();
        return ResponseEntity.created(uri).body(new StudentResponse(student));
    }

    @GetMapping
    public StudentResponse getStudent(){
        return new StudentResponse(
                new Student(
                        UUID.randomUUID(),
                        "Vitoria Toebe",
                        "Turma 811",
                        "vrtoebe@gmail.com",
                        "12345"
                )
        );
    }
}
