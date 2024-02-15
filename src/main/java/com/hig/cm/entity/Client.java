package com.hig.cm.entity;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    @Id
    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String clntid;
    @NotEmpty
    @Size(max=60)
    private String name1;
    @NotEmpty
    @Size(max=2)
    private String lglentitycd;

    @NotEmpty
    @Size(max=9)
    private String emplyridnbr;

    public Client() {}
}
