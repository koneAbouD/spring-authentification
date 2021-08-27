package com.example.SpringSecurityAuth.controlleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class UtilisateurController {
    @RequestMapping("/*")
    @RolesAllowed("USER")
    public String getUser(){
        return "welcom, user";
    }
    @RequestMapping("/admin")
    @RolesAllowed("ADMIN")
    public String getAdmin(){
        return "welcom, admin";
    }
}
