package com.hig.cm.entity;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveRestart {
    @Size(min=8, max=8)
    @Pattern(regexp = "^[A-Z0-9]{8}$")
    private String caseid;
    @Size(max = 1)
    private String cvrgind;
    @Size(max = 1)
    private String fndngmthdind;
    @Size(max = 1)
    private String empgrpind;

    public SaveRestart() {}
}
