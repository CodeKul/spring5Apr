package com.codekul.spring5Apr.jpa.controller;

import com.codekul.spring5Apr.jpa.dto.TutorialRequestDto;
import com.codekul.spring5Apr.jpa.entity.Tutorial;
import com.codekul.spring5Apr.jpa.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        try {
            return ResponseEntity.ok(tutorialService.findAll());
        }catch (Exception e){
            return new ResponseEntity<>("No records",HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<?> getById(@PathVariable(value = "id") Long id){
        Tutorial tutorial = tutorialService.getById(id);
        if (tutorial != null){
            return ResponseEntity.ok(tutorialService.getById(id));
        }
        else
            return new ResponseEntity<>("Record with id " +id +" does not exists" ,HttpStatus.NOT_FOUND);
    }
}
