package com.codekul.spring5Apr.jpa.controller;

import com.codekul.spring5Apr.jpa.dto.TutorialRequestDto;
import com.codekul.spring5Apr.jpa.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutorials")
public class TutorialController {
    @Autowired
    private TutorialService tutorialService;

    @PostMapping
    public String saveTutorial(@RequestBody TutorialRequestDto requestDto){
        tutorialService.saveTutorial(requestDto);
        return "Record saved successfully";
    }
}
