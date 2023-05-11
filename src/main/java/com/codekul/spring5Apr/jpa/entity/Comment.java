package com.codekul.spring5Apr.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private LocalDate commentedDate = LocalDate.now();

    private LocalTime commentedTime = LocalTime.now();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tutorial_id")
    @JsonIgnore
    private Tutorial tutorial;
}
