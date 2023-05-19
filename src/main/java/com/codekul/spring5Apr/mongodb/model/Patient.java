package com.codekul.spring5Apr.mongodb.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Document(collection = "patient_info")
public class Patient {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;
}
