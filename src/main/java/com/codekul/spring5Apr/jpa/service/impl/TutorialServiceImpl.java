package com.codekul.spring5Apr.jpa.service.impl;

import com.codekul.spring5Apr.jpa.dto.TutorialDetailsRequestDto;
import com.codekul.spring5Apr.jpa.dto.TutorialRequestDto;
import com.codekul.spring5Apr.jpa.entity.Tutorial;
import com.codekul.spring5Apr.jpa.entity.TutorialDetails;
import com.codekul.spring5Apr.jpa.repository.TutorialDetailsRepository;
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
    @Autowired
    private TutorialDetailsRepository tutorialDetailsRepository;


    @Override
    public void saveTutorial(TutorialRequestDto requestDto) {
        Tutorial tutorial = new Tutorial();
        tutorial.setTitle(requestDto.getTitle());
        tutorial.setDescription(requestDto.getDescription());
        tutorial.setSubject(requestDto.getSubject());
        Tutorial  tutorial1 = tutorialRepository.save(tutorial);

        TutorialDetails tutorialDetails = new TutorialDetails();
        TutorialDetailsRequestDto details = requestDto.getTutorialDetails();
        tutorialDetails.setAuthor(details.getAuthor());
        tutorialDetails.setPublishedOn(details.getPublishedOn());
        tutorialDetails.setEmail(details.getEmail());
        tutorialDetails.setMobile(details.getMobile());
        tutorialDetails.setTutorial(tutorial1);
        tutorialDetailsRepository.save(tutorialDetails);
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

    @Override
    public String updateTutorial(TutorialRequestDto requestDto,Long tutorialId) {
        Optional<Tutorial> optionalTutorial = tutorialRepository.findById(tutorialId);
        if (optionalTutorial.isPresent()){
            Tutorial tutorial = optionalTutorial.get();
            tutorial.setSubject(requestDto.getSubject());
            tutorial.setDescription(requestDto.getDescription());
            tutorial.setTitle(requestDto.getTitle());
            tutorialRepository.save(tutorial);
            return "Record updated successfully";
        }
        return "Record with given id "+tutorialId + " does not exists";
    }

    @Override
    public String updateTutorial(Tutorial tutorial) {
        tutorialRepository.save(tutorial);
        return "Record updated successfully";
    }

    @Override
    public String deleteTutorial(Long tutorialId) {
        if(tutorialRepository.existsById(tutorialId)) {
            tutorialRepository.deleteById(tutorialId);
            return "Record deleted successfully";
        }
        return "Record with given id "+tutorialId + " does not exists";
    }
}
