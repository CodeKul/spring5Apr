package com.codekul.spring5Apr.jpa.service;

import com.codekul.spring5Apr.jpa.dto.TutorialRequestDto;

public interface TutorialService {
    void saveTutorial(TutorialRequestDto requestDto);
}
