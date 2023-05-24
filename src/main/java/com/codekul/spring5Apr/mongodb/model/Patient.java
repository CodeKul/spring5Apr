package com.codekul.spring5Apr.mongodb.model;

import com.codekul.spring5Apr.mongodb.embedded.PatientRelatives;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Document(collection = "patient_info")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Patient {
    @Id
    private String id;
    @TextIndexed(weight = 1)
    private String firstName;
    @TextIndexed(weight = 2)
    private String lastName;
    private Date birthDate;
    @Indexed(unique = true)
    private String email;
    private List<PatientRelatives> patientRelatives;
}
