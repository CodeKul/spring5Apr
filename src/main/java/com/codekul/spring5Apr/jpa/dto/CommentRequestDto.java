package com.codekul.spring5Apr.jpa.dto;

import com.codekul.spring5Apr.jpa.entity.Tutorial;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class CommentRequestDto {
   private Long id;

    private String content;

    private Tutorial tutorial;
}
