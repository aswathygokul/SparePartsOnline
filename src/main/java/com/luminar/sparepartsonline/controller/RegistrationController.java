package com.luminar.sparepartsonline.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {
    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register";
    }

}
