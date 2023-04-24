package com.codekul.spring5Apr.jdbctemplate.controller;

import com.codekul.spring5Apr.jdbctemplate.service.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/getStudentCount")
    public Integer getStudentCount(){
          return studentRepository.getStudentCount();
    }
}
