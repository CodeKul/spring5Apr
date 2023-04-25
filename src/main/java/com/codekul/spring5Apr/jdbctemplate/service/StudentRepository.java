package com.codekul.spring5Apr.jdbctemplate.service;

import com.codekul.spring5Apr.jdbctemplate.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository {
    Integer getStudentCount();

    /**
     *
     * {
     *     "rno":12,
     *     "name":"Anuja",
     *     "age":26,
     *     "city":"Pune",
     *     "email":"anuja@gmail.com",
     *     "phone":"896522"
     * }
     */
    String saveStudent(Student student);
}
