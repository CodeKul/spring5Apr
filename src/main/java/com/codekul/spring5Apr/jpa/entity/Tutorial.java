package com.codekul.spring5Apr.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
}
