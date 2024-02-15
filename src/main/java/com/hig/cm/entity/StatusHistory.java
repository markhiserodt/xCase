package com.hig.cm.entity;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class StatusHistory {

    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String caseid;

    @NotNull
    private Date trnsctndt;

    @NotEmpty
    @Size(max = 2)
    private String sttschngid;

    @Min(0)
    @Max(9999)
    private int btchnbr;

    private Date prcssddt;

    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String prcsrid;

    public StatusHistory() {}
}
