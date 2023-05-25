package com.codekul.spring5Apr.mongodb.service.impl;

import com.codekul.spring5Apr.mongodb.model.Appointment;
import com.codekul.spring5Apr.mongodb.model.Patient;
import com.codekul.spring5Apr.mongodb.repository.AppointmentRepository;
import com.codekul.spring5Apr.mongodb.repository.PatientRepository;
import com.codekul.spring5Apr.mongodb.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public String saveAppointment(Appointment appointment) {
        Patient patient;
        if (appointment.getPatient()!=null && appointment.getPatient().getId()==null){
           patient =  patientRepository.save(appointment.getPatient());
           appointment.setPatient(patient);
        }
        appointmentRepository.save(appointment);
        return "Appointment saved successfully";
    }
}
