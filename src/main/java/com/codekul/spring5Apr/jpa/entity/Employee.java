package com.codekul.spring5Apr.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Getter
@Setter
@Entity

public class Employee {
    @EmbeddedId
    private EmployeeId employeeId;
    private String lastName;
    private String address;
}
