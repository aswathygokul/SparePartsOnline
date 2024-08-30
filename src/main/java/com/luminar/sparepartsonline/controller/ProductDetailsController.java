package com.luminar.sparepartsonline.controller;


import com.luminar.sparepartsonline.entity.ProductDetails;
import com.luminar.sparepartsonline.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductDetailsController {

    @Autowired
    private ProductDetailsService productDetailsService;

    @GetMapping("/products")
    public String getAllProducts(Model model) {
        List<ProductDetails> products = productDetailsService.getAllProducts();
        model.addAttribute("products", products);
        return "product-list";
    }

    @GetMapping("/products/{id}")
    public String getProductById(@PathVariable Long id, Model model) {
        ProductDetails product = productDetailsService.getProductById(id);
        model.addAttribute("product", product);
        return "product-details";
    }

}
