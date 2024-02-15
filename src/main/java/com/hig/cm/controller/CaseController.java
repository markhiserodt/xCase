package com.hig.cm.controller;

import com.hig.cm.entity.Case;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@SecurityScheme(
    name = "Authorization",
    type = SecuritySchemeType.HTTP,
    bearerFormat = "JWT",
    scheme = "bearer"
)
@RestController
@RequestMapping("/caseDetails")
public class CaseController {

    @SecurityRequirement(name = "Authorization")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Saved the case"),
        @ApiResponse(responseCode = "400", description = "Invalid case object supplied", content = @Content),
    })
    @PostMapping(value = "/addCase", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Case addCase(@RequestBody Case _case) {
        return new Case();
    }
}
