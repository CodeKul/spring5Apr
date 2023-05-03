package com.codekul.spring5Apr.jpa.service.impl;

import com.codekul.spring5Apr.jpa.dto.TutorialRequestDto;
import com.codekul.spring5Apr.jpa.entity.Tutorial;
import com.codekul.spring5Apr.jpa.repository.TutorialRepository;
import com.codekul.spring5Apr.jpa.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutorialServiceImpl implements TutorialService {
    @Autowired
    private TutorialRepository tutorialRepository;

    @Override
    public void saveTutorial(TutorialRequestDto requestDto) {
        Tutorial tutorial = new Tutorial();
        tutorial.setTitle(requestDto.getTitle());
        tutorial.setDescription(requestDto.getDescription());
        tutorial.setSubject(requestDto.getSubject());
        tutorialRepository.save(tutorial);
    }

    @Override
    public List<Tutorial> findAll() {
        return tutorialRepository.findAll();
    }

    @Override
    public Tutorial getById(Long id) {
        Optional<Tutorial> optionalTutorial = tutorialRepository.findById(id);
        return optionalTutorial.orElse(null);

    }

    @Override
    public Tutorial getTutorialByTitle(String title) {
        return tutorialRepository.findByTitle(title).orElse(null);
    }
}
