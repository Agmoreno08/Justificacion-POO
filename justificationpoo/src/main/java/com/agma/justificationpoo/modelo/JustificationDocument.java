package com.agma.justificationpoo.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class JustificationDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Required
    @Stereotype("DATE")
    @Column(nullable = false)
    private Date issueDate;

    @Required
    @Column(length = 50, nullable = false)
    private String documentType;

    @Enumerated(EnumType.STRING)
    @Required
    @Column(length = 20, nullable = false)
    private ValidationStatus validationStatus;

    @Stereotype("MEMO")
    @Column(length = 500)
    private String medicalInformation;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @DescriptionsList(descriptionProperties = "fullName")
    private Student student;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @DescriptionsList(descriptionProperties = "fullName")
    private Administrator administrator;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @DescriptionsList(descriptionProperties = "fullName")
    private Teacher teacher;

    @Stereotype("FILE")
    private String supportingDocument;

    @Depends("validationStatus")
    public boolean isValid() {
        return validationStatus == ValidationStatus.VALIDATED;
    }

    @Column(length = 500)
    private String comments;
}
