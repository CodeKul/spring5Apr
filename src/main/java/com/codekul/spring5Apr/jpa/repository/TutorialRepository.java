package com.codekul.spring5Apr.jpa.repository;

import com.codekul.spring5Apr.jpa.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial,Long> {
}
