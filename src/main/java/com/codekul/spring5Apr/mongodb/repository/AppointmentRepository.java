package com.codekul.spring5Apr.mongodb.repository;

import com.codekul.spring5Apr.mongodb.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppointmentRepository extends MongoRepository<Appointment,Long> {
}
