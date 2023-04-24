package com.codekul.spring5Apr.jdbctemplate.service.impl;

import com.codekul.spring5Apr.jdbctemplate.service.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentRepositoryImpl implements StudentRepository {
    private final String studCount = "select count(*) from student;";
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer getStudentCount() {
        return jdbcTemplate.queryForObject(studCount,Integer.class);
    }
}
