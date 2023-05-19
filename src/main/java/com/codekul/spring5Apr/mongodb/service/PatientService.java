package com.codekul.spring5Apr.mongodb.service;

import com.codekul.spring5Apr.mongodb.model.Patient;

import java.util.List;

public interface PatientService {
    String savePatient(Patient patient);

    List<Patient> searchByFirstName(String fName);
    List<Patient> searchByFirstNameAndLastName(String fName,String lName);
}
