package com.codekul.spring5Apr.jpa.service.impl;

import com.codekul.spring5Apr.jpa.dto.EmployeeRequestDto;
import com.codekul.spring5Apr.jpa.entity.Employee;
import com.codekul.spring5Apr.jpa.entity.EmployeeId;
import com.codekul.spring5Apr.jpa.repository.EmployeeRepository;
import com.codekul.spring5Apr.jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void saveEmployee(EmployeeRequestDto employeeRequestDto) {
        Employee employee = new Employee();
        employee.setAddress(employeeRequestDto.getAddress());
        employee.setLastName(employeeRequestDto.getLastName());
        EmployeeId employeeId = new EmployeeId();
        employeeId.setFirstName(employeeRequestDto.getFirstName());
        employeeId.setMobile(employeeRequestDto.getMobile());
        employee.setEmployeeId(employeeId);
        employeeRepository.save(employee);
    }
}
