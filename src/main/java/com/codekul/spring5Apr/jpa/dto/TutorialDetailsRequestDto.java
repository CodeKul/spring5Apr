package com.codekul.spring5Apr.jpa.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
public class TutorialDetailsRequestDto {
    private Long id;
    private LocalDate publishedOn;
    private String author;
    @NotNull(message = "Subject can not be null")
    @NotBlank(message = "Subject can not be blank")
    @Email(message = "Email is not valid")
    private String email;
    @Size(min = 10,max = 13,message = "Mobile No must be between 10 to 13")
    private String mobile;

}
