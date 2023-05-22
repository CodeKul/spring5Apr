package com.codekul.spring5Apr.mongodb.service.impl;

import com.codekul.spring5Apr.mongodb.model.Patient;
import com.codekul.spring5Apr.mongodb.repository.PatientRepository;
import com.codekul.spring5Apr.mongodb.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public String savePatient(Patient patient) {
        try {
            patientRepository.save(patient);
            return "Patient saved successfully";
        }catch (Exception e){
            e.printStackTrace();
            return "Something went wrong";
        }
    }

    @Override
    public List<Patient> searchByFirstName(String fName) {
        return patientRepository.findByFirstName(fName);
    }

    @Override
    public List<Patient> searchByFirstNameAndLastName(String fName, String lName) {
        return patientRepository.findByFirstNameAndLastName(fName, lName);
    }

    @Override
    public List<Patient> searchPatient(String searchString) {
        return patientRepository.searchPatient(searchString);
    }
}
