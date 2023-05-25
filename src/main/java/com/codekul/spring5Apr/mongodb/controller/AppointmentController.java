package com.codekul.spring5Apr.mongodb.controller;

import com.codekul.spring5Apr.mongodb.model.Appointment;
import com.codekul.spring5Apr.mongodb.repository.AppointmentRepository;
import com.codekul.spring5Apr.mongodb.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
        @Autowired
        private AppointmentService appointmentService;
    @PostMapping
    public ResponseEntity<?> bookAppointment(@RequestBody Appointment appointment){

        return  ResponseEntity.ok(appointmentService.saveAppointment(appointment));
    }
}
