package com.codekul.spring5Apr.mongodb.repository;

import com.codekul.spring5Apr.mongodb.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PatientRepository extends MongoRepository<Patient,String> {

    @Query("{firstName:?0}")
    List<Patient> findByFirstName(String name);

    @Query("{$and:[{firstName:?0},{lastName:?1}]}")
    List<Patient> findByFirstNameAndLastName(String fname,String lname);

}
