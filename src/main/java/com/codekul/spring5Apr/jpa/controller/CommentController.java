package com.codekul.spring5Apr.jpa.controller;

import com.codekul.spring5Apr.jpa.dto.CommentRequestDto;
import com.codekul.spring5Apr.jpa.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public ResponseEntity<?> saveComments(@RequestBody CommentRequestDto requestDto){
        try {
            commentService.saveComments(requestDto);
            return ResponseEntity.ok("Comment saved successfully");
        }catch (Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PutMapping("/updateComments")
    public ResponseEntity<?> updateComments(@RequestBody CommentRequestDto requestDto){
        return ResponseEntity.ok(commentService.updateComments(requestDto));
    }

    @GetMapping("/getCommentsByTutorialId/{tutorialId}")
    public ResponseEntity<?>  getCommentsByTutorialId(@PathVariable(name = "tutorialId") Long tutorialId){
        return ResponseEntity.ok(commentService.getCommentsByTutorialId(tutorialId));
    }

    @DeleteMapping
    public ResponseEntity<?> deleteComment(@RequestParam Long commentId){
        return ResponseEntity.ok(commentService.deleteComment(commentId));
    }
}
