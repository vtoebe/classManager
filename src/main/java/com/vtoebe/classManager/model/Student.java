package com.vtoebe.classManager.model;

import com.vtoebe.classManager.request.StudentRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@AllArgsConstructor
public class Student {
    private UUID id;
    private String name;
    private String className;
    private String email;
    private String password;

    public Student(StudentRequest studentRequest){
        this.id = UUID.randomUUID();
        this.name = studentRequest.getName();
        this.className = studentRequest.getClassName();
        this.email = studentRequest.getEmail();
        this.password = studentRequest.getPassword();
    }
}
