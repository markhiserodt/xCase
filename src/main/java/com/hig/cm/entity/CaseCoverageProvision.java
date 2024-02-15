package com.hig.cm.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CaseCoverageProvision {
    @NotNull
    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String caseid;

    @NotNull
    @Size(max=4)
    private String prvsnid;

    @NotNull
    @Size(max=4)
    private String cvrgctgrycd;

    @NotNull
    @Size(max=4)
    private String cvrgtypcd;

    @NotNull
    @Size(max=4)
    private String fndngmthdcd;

    @NotNull
    @Size(max=3)
    private String clsscd;

    @NotNull
    @Size(max=3)
    private String plnnbr;

    @Size(max=4)
    private String optnid;

    @Max(9999)
    private int slctnnbr;

    @Size(max=75)
    private String dscrptn;

    @Size(max=1)
    private String drtnind;

    @NotNull()
    private Date prvsnoptneffctvdt;

    private Date prvsnoptntrmdt;

    @Size(max=1)
    private String prvsnqlfrcd;

    private int prod_prvsn_opt_id;

    public CaseCoverageProvision() {}
}
