package com.vtoebe.classManager.response;

import com.vtoebe.classManager.model.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@AllArgsConstructor
public class StudentResponse {
    private UUID id;
    private String name;
    private String className;
    private String email;

    public StudentResponse(Student student){
        this.id = student.getId();
        this.name = student.getName();
        this.className = student.getClassName();
        this.email = student.getEmail();
    }
}
