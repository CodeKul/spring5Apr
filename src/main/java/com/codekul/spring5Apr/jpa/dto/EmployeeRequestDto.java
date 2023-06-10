package com.codekul.spring5Apr.jpa.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeRequestDto {
    private String firstName;
    private String mobile;
    private String lastName;
    private String address;
}
