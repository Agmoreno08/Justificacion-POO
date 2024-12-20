package com.agma.justificationpoo.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;


@Entity
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    @Required
    private String firstName;

    @Column(length = 50, nullable = false)
    @Required
    private String lastName;

    @Stereotype("EMAIL")
    @Column(length = 100, nullable = false)
    @Required
    private String email;

    @Column(length = 50)
    private String classSchedule;

    @Files
    private String justification;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    @ListProperties("id, documentType, validationStatus, issueDate")
    private List<JustificationDocument> documents;

    @Depends("firstName, lastName")
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
