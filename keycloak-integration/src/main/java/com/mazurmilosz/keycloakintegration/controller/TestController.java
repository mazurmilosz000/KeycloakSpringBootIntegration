package com.mazurmilosz.keycloakintegration.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/user")
    @PreAuthorize("hasRole('user_client')")
    public String user() {
        return "user endpoint";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('admin_client')")
    public String admin() {
        return "admin endpoint";
    }

}
