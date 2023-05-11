package com.codekul.spring5Apr.jpa.service.impl;

import com.codekul.spring5Apr.jpa.dto.CommentRequestDto;
import com.codekul.spring5Apr.jpa.entity.Comment;
import com.codekul.spring5Apr.jpa.entity.Tutorial;
import com.codekul.spring5Apr.jpa.repository.CommentRepository;
import com.codekul.spring5Apr.jpa.repository.TutorialRepository;
import com.codekul.spring5Apr.jpa.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private TutorialRepository tutorialRepository;
    @Override
    public void saveComments(CommentRequestDto requestDto) {
        Comment comment = new Comment();
        comment.setContent(requestDto.getContent());
        comment.setTutorial(requestDto.getTutorial());
        commentRepository.save(comment);
    }

    @Override
    public Tutorial getCommentsByTutorialId(Long tutorialId) {
        return tutorialRepository.findById(tutorialId).orElse(null);
    }

    @Override
    public String updateComments(CommentRequestDto requestDto) {
        Optional<Comment> commentOptional = commentRepository.findById(requestDto.getId());
        if (commentOptional.isPresent()){
            Comment comment = commentOptional.get();
            comment.setContent(requestDto.getContent());
            commentRepository.save(comment);
            return "Comment updated successfully";
        }else {
            return "Record with id "+ requestDto.getId() +" doesn't exists";
        }
    }


    @Override
    public String deleteComment(Long commentId) {
        Boolean isPresent = commentRepository.existsById(commentId);
        if (isPresent){
            commentRepository.deleteById(commentId);
            return "Comment deleted successfully";
        }else {
            return "Record with id "+ commentId +" doesn't exists";
        }
    }
}
