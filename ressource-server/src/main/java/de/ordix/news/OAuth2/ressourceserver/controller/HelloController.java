package de.ordix.news.OAuth2.ressourceserver.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping()
    public String hello(Principal principal) {
        return "Hallo " + principal.getName();
    }
}