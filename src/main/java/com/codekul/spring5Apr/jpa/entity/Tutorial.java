package com.codekul.spring5Apr.jpa.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tutorials")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Title can not be null")
    private String title;
    @Column(name = "tutorial_description")
    private String description;
    private String subject;

    @OneToMany(mappedBy = "tutorial",fetch = FetchType.EAGER)
    private List<Comment> comments;
}
