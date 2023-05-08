package com.codekul.spring5Apr.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tutorial_details")
public class TutorialDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "published_on")
    private LocalDate publishedOn;
    @Column(name = "created_by")
    private String author;

    @NotNull(message = "Subject can not be null")
    @NotBlank(message = "Subject can not be blank")
    @Email(message = "Email is not valid")
    private String email;

    @Size(min = 10,max = 13)
    private String mobile;

    @OneToOne
    @JoinColumn(name = "tutorial_id")
    private Tutorial tutorial;
}
