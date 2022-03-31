package com.vtoebe.classManager.request;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class StudentRequest {
    @NotBlank @NotNull @Size(min = 2)
    private String name;
    @NotBlank @NotNull
    private String className;
    @NotBlank @NotNull @Size(min = 5)
    private String email;
    @NotBlank @NotNull @Size(min = 4)
    private String password;
}
