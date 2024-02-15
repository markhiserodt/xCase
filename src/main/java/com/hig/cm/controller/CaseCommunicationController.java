package com.hig.cm.controller;

import com.hig.cm.entity.Contact;
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
@RequestMapping("/caseCommunication")
public class CaseCommunicationController {

    @SecurityRequirement(name = "Authorization")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Determines if contact exists for given case"),
    })
    @GetMapping(value = "contactExists")
    public boolean contactExists(@RequestParam String caseId) {
        return true;
    }

//    @SecurityRequirement(name = "Authorization")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "Retrieved case details"),
//            @ApiResponse(responseCode = "400", description = "Contact not found", content = @Content),
//    })
//    @GetMapping(value = "contactExists")
//    public boolean contactExists(@RequestParam String caseId) {
//        return true;
//    }
}
