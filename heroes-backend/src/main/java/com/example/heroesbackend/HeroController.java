package com.example.heroesbackend;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/heroes")
public class HeroController {

    @GetMapping
    @PreAuthorize("hasAuthority('ROLE_APP-ADMIN')")
    public ResponseEntity<List<String>> findAll(){
        return ResponseEntity.ok(List.of("Hero1", "Hero2"));
    }
}
