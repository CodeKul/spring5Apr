package com.codekul.spring5Apr.jpa.service;

import com.codekul.spring5Apr.jpa.dto.EmployeeRequestDto;
import com.codekul.spring5Apr.jpa.entity.Employee;

public interface EmployeeService {
    void saveEmployee(EmployeeRequestDto employee);
}
