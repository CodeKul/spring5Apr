package com.codekul.spring5Apr.jpa.repository;

import com.codekul.spring5Apr.jpa.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
