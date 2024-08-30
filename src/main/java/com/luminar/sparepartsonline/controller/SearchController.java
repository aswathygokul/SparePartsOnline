package com.luminar.sparepartsonline.controller;


import com.luminar.sparepartsonline.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
    @Autowired
    private ProductService productService;

    @GetMapping("/searchProduct")
    public String searchProducts(@RequestParam("query") String query, Model model) {
        // Call service to get products based on search query
        model.addAttribute("products", productService.searchProducts(query));
        model.addAttribute("query", query);
        return "search-results";
    }
}
