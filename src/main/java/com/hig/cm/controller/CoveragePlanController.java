package com.hig.cm.controller;

import com.hig.cm.entity.CoveragePlan;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SecurityScheme(
        name = "Authorization",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
@RestController
@RequestMapping("/coveragePlan")
public class CoveragePlanController {

    @SecurityRequirement(name = "Authorization")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retrieved coverage plan details"),
            @ApiResponse(responseCode = "400", description = "Coverage plan not found", content = @Content),
    })
    @GetMapping(value = "getCoveragePlan")
    public CoveragePlan getCoveragePlan(@RequestParam String caseId) {
        return new CoveragePlan();
    }
}
