package com.codekul.spring5Apr.jpa.service;

import com.codekul.spring5Apr.jpa.dto.TutorialRequestDto;
import com.codekul.spring5Apr.jpa.entity.Tutorial;

import java.util.List;

public interface TutorialService {
    void saveTutorial(TutorialRequestDto requestDto);

    List<Tutorial> findAll();

    Tutorial getById(Long id);

    Tutorial getTutorialByTitle(String title);

    String updateTutorial(TutorialRequestDto requestDto,Long tutorialId);

    String updateTutorial(Tutorial tutorial);

    String deleteTutorial(Long tutorialId);

    void saveTutorialWithTags(Tutorial tutorial);
}
