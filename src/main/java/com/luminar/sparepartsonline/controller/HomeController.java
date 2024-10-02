package com.luminar.sparepartsonline.controller;

import com.luminar.sparepartsonline.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome() {


        return "home";
    }
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/homeService")
    public String service() {

        return "home-service";
    }

    @GetMapping("/aboutUs")
    public String aboutUs() {

        return "about-us";
    }

    @GetMapping("/contactUs")
    public String contactUs() {
        return "contact-us";
    }

    @GetMapping("/homeLogin")
    public String homeLogin() {
        return "login";

    }

    private final SearchService searchService;

    // Constructor injection
    @Autowired
    public HomeController(SearchService searchService) {
        this.searchService = searchService;
    }
    @GetMapping("/search")
    public String search(@RequestParam("query") String query, Model model){
        model.addAttribute("products", searchService.findResults(query));
        return "search-results";

    }
}
