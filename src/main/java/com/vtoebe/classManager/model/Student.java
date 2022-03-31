package com.vtoebe.classManager.model;

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
}
