package com.codekul.spring5Apr.mongodb.controller;

import com.codekul.spring5Apr.mongodb.model.Patient;
import com.codekul.spring5Apr.mongodb.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping
    public ResponseEntity<?> savePatient(@RequestBody Patient patient){
        return ResponseEntity.ok(patientService.savePatient(patient));
    }

    @GetMapping("/searchByFirstName")
    public ResponseEntity<?> searchByFirstName(@RequestParam String fname){
        return ResponseEntity.ok(patientService.searchByFirstName(fname));
    }

    @GetMapping("/searchByFirstNameAndLastName")
    public ResponseEntity<?> searchByFirstNameAndLastName(@RequestParam String fname,
                                                          @RequestParam String lname){
        return ResponseEntity.ok(patientService.searchByFirstNameAndLastName(fname,lname));
    }
}
