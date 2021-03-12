package com.github.paulosalonso.keycloakstarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/secure-resource")
public class SecureController {

    @GetMapping
    public String read() {
        return "Autnehticated!!";
    }
}
