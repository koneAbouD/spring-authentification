package com.example.SpringSecurityAuth.controlleur;

import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.annotation.security.RolesAllowed;
import java.net.URI;

@RestController
public class UtilisateurController {

    @GetMapping("/hello")
    public String getHello() {
        return "<h1>Hello World</h1>";
    }

    @GetMapping("/user")
    public String getUser() {
        return "<h1>Hello User</h1>";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "<h1>Hello Admin</h1>";
    }
}
