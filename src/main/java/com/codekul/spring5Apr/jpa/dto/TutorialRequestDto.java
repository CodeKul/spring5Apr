package com.codekul.spring5Apr.jpa.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class TutorialRequestDto {
    @NotNull(message = "Title can not be null")
    @NotBlank(message = "Title can not be blank")
    private String title;

    @NotNull(message = "Description can not be null")
    @NotBlank(message = "Description can not be blank")
    private String description;

    @NotNull(message = "Subject can not be null")
    @NotBlank(message = "Subject can not be blank")
    private String subject;

    private TutorialDetailsRequestDto tutorialDetails;
}
