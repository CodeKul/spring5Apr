package com.codekul.spring5Apr.mongodb.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Document
public class Appointment {
    @Id
    private String id;
    private LocalDate appointmentDate = LocalDate.now();
    private LocalTime appointmentTime = LocalTime.now();
    private String department;
    @DBRef
    private Patient patient;
}
