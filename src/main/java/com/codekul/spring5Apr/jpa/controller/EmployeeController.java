package com.codekul.spring5Apr.jpa.controller;

import com.codekul.spring5Apr.jpa.dto.EmployeeRequestDto;
import com.codekul.spring5Apr.jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping
    public ResponseEntity<?> saveEmployee(@RequestBody EmployeeRequestDto employeeRequestDto){
        employeeService.saveEmployee(employeeRequestDto);
        return ResponseEntity.ok("Employee saved successfully");
    }


}
