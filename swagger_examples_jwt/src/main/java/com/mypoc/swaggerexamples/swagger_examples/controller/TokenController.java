package com.mypoc.swaggerexamples.swagger_examples.controller;


import com.mypoc.swaggerexamples.swagger_examples.model.JwtUser;
import com.mypoc.swaggerexamples.swagger_examples.security.JwtGenerator;
import io.swagger.annotations.Api;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
@Api(tags = {"Token"},description = "Generating Token<style>.models {display: none !important}</style>")
public class TokenController {


    private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser) {

        return jwtGenerator.generate(jwtUser);

    }
}
