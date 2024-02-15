package com.hig.cm.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Contact {

    @NotNull
    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String id;

    @NotNull
    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String caseId;

    @NotEmpty
    @Size(max=30)
    private String firstName;
    @Size(max=1)
    private String middleInitial;
    @NotEmpty
    @Size(max=30)
    private String lastName;
    @Size(max=3)
    private String nameSuffix;
    @NotEmpty
    @Size(max=40)
    private String department;
    @NotEmpty
    @Size(max=40)
    private String title;
    @NotEmpty
    @Pattern(regexp = "^[0-9]{12}$")
    private String phoneNumber;
    @Size(max=12)
    private String faxNumber;
    @Size(max=6)
    private String phoneExtension;
    @NotEmpty
    @Size(max=60)
    private String emailAddress;

    @NotNull
    private ContactAddress contactAddress;
    public Contact() {}
}
