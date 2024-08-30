package com.luminar.sparepartsonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service")
public class ServiceController {

    @GetMapping
    public String servicePage(){

        return "service";
    }
    @GetMapping("/buy-new-parts")
    public String buyNewPartsPage() {
        return "buy-new-parts";
    }

    @GetMapping("/buy-old-parts")
    public String buyOldPartsPage() {

        return "buy-old-parts";
    }

    @GetMapping("/sell-old-parts")
    public String sellOldPartsPage() {

        return "sell-old-parts";
    }
}
