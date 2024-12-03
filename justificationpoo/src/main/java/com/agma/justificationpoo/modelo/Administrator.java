package com.agma.justificationpoo.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;


@Entity
@Getter
@Setter
public class Administrator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    @Required
    private String firstName;

    @Column(length = 50, nullable = false)
    @Required
    private String lastName;

    @Column(length = 50, nullable = false)
    @Required
    private String role;

    @Column(length = 50)
    private String accessPermissions;

    @OneToMany(mappedBy = "administrator", cascade = CascadeType.ALL, orphanRemoval = true)
    @ListProperties("id, documentType, validationStatus, issueDate")
    private List<JustificationDocument> validatedDocuments;

    @Depends("firstName, lastName")
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
