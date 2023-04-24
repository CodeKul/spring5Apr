package com.codekul.spring5Apr.jdbctemplate.service;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository {
    Integer getStudentCount();
}
