package com.codekul.spring5Apr.jpa.service;

import com.codekul.spring5Apr.jpa.dto.CommentRequestDto;
import com.codekul.spring5Apr.jpa.entity.Comment;
import com.codekul.spring5Apr.jpa.entity.Tutorial;

public interface CommentService {
    void saveComments(CommentRequestDto requestDto);

    Tutorial getCommentsByTutorialId(Long tutorialId);

    String updateComments(CommentRequestDto requestDto);

    String deleteComment(Long commentId);
}
