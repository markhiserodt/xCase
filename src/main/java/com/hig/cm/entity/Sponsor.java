package com.hig.cm.entity;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sponsor {
    @Id
    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String spnsrid;

    @Size(max=40)
    private String dscrptn;

    @Size(max=4)
    private String nodetypcd;

    @Size(max=1)
    private String lttrhndlngcd;

    public Sponsor() {}
}
