package com.mazurmilosz.keycloakintegration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/user")
    public String user() {
        return "user endpoint";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin endpoint";
    }

}
