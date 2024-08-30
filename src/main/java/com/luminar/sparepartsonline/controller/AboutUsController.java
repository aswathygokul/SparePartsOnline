package com.luminar.sparepartsonline.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about-us")
public class AboutUsController {
    @GetMapping
    public String aboutUsPage() {
        return "about-us";
    }
}
