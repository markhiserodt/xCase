package com.hig.cm.entity;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Case {
    @NotNull
    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String caseid;

    @NotNull
    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String clntid;

    @NotNull
    @Min(0)
    @Max(9999999)
    private int emplyeecnt;

    @Min(0)
    @Max(9999)
    private int slsoffccd;

    @NotNull
    private Date cvrgeffctvdt;

    @Size(max = 2)
    private String stssttcd;
    @Size(max = 4)
    private String sttscd;

    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String pndngcaseid;

    @Size(max = 1)
    private String cnvrsnind;

    private Date casetrmdt;

    @Size(max = 4)
    private String spnsrid;

    @Max(9999)
    private int imsoffcid;

    private int prismclntid;

    private Client client;
    private Sponsor sponsor;
    private SaveRestart saveRestart;

    public Case() {}
}
