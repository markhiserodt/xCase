package com.hig.cm.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class CoveragePlan {

    @NotNull
    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String caseid;

    @NotNull
    @Size(max=4)
    private String cvrgctgrycd;

    @NotNull
    @Size(max=4)
    private String cvrgtypcd;

    @NotNull
    @Size(max=3)
    private String plnnbr;

    @Size(max=60)
    private String dscrptn;

    @Size(max=1)
    private String uwtypcd;


    @NotNull
    private Date cvrgplneffctvdt;

    private Date cvrgplntrmdt;

    List<CaseCoverageProvision> caseCoverageProvisions;

    public CoveragePlan() {}
}
