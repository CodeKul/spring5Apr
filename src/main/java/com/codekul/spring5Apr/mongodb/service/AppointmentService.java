package com.codekul.spring5Apr.mongodb.service;

import com.codekul.spring5Apr.mongodb.model.Appointment;

public interface AppointmentService {
    String saveAppointment(Appointment appointment);
}
