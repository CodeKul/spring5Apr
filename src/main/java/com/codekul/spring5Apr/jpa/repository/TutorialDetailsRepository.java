package com.codekul.spring5Apr.jpa.repository;

import com.codekul.spring5Apr.jpa.entity.TutorialDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialDetailsRepository extends JpaRepository<TutorialDetails,Long> {
}
