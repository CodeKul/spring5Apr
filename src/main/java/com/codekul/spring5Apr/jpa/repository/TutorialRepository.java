package com.codekul.spring5Apr.jpa.repository;

import com.codekul.spring5Apr.jpa.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TutorialRepository extends JpaRepository<Tutorial,Long> {
    Optional<Tutorial> findByTitle(String title);

    @Query(value = "select * from tutorials where subject = ?1 and title = ?2",nativeQuery = true)
    Optional<Tutorial> findByTitleAndSubject(String title,String subject);
}
