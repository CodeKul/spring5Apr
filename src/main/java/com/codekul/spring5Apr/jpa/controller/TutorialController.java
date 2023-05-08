package com.codekul.spring5Apr.jpa.controller;

import com.codekul.spring5Apr.jpa.dto.TutorialRequestDto;
import com.codekul.spring5Apr.jpa.entity.Tutorial;
import com.codekul.spring5Apr.jpa.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tutorials")
public class TutorialController {
    @Autowired
    private TutorialService tutorialService;

    @PostMapping
    public String saveTutorial(@Valid @RequestBody TutorialRequestDto requestDto){
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
            return ResponseEntity.ok(tutorial);
        }
        else
            return new ResponseEntity<>("Record with id " +id +" does not exists" ,HttpStatus.NOT_FOUND);
    }

    @GetMapping("/getByTitle")
    public ResponseEntity<?> getByTitle(@RequestParam String title){
        Tutorial tutorial = tutorialService.getTutorialByTitle(title);
        if (tutorial != null){
            return ResponseEntity.ok(tutorial);
        }
        else
            return new ResponseEntity<>("Record with title " +title +" does not exists" ,HttpStatus.NOT_FOUND);
    }

    @PutMapping("/updateTutorial/{tutorialId}")
    public ResponseEntity<?> updateTutorial(@PathVariable Long tutorialId,
            @RequestBody TutorialRequestDto requestDto){
        try {
            return ResponseEntity.ok(tutorialService.updateTutorial(requestDto, tutorialId));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Something went wrong "+e.getMessage());
        }
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateTutorial(@RequestBody Tutorial tutorial){
        return ResponseEntity.ok(tutorialService.updateTutorial(tutorial));
    }

    @DeleteMapping("{tutorialId}")
    public ResponseEntity<?> deleteTutorial(@PathVariable Long tutorialId){
        return ResponseEntity.ok(tutorialService.deleteTutorial(tutorialId));
    }
}
