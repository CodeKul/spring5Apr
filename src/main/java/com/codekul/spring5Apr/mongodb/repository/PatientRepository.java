package com.codekul.spring5Apr.mongodb.repository;

import com.codekul.spring5Apr.mongodb.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient,String> {

    Patient findByFirstName(String name);

}
