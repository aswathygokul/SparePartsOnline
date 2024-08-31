package com.luminar.sparepartsonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/service")
public class ServiceController {

    @GetMapping
    public String servicePage() {

        return "service";
    }

    @GetMapping("/buy-new-parts")
    public String buyNewPartsPage(Model model) {
        model.addAttribute("productName", "Steering");
        model.addAttribute("productBrand", "ABC");
        model.addAttribute("productModel", "2023");
        model.addAttribute("productYear", "2023");
        model.addAttribute("productPrice", "4500");
        model.addAttribute("availability", "In Stock");


        return "buy-new-parts";
    }

    @GetMapping("/buy-old-parts")
    public String buyOldPartsPage(Model model) {
        model.addAttribute("productName", "Steering");
        model.addAttribute("productBrand", "XYZ");
        model.addAttribute("productModel", "2019");
        model.addAttribute("productYear", "2019");
        model.addAttribute("productPrice", "2500");
        model.addAttribute("availability", "In Stock");

        return "buy-old-parts";
    }

    @GetMapping("/sell-old-parts")
    public String sellOldPartsPage() {

        return "sell-old-parts";
    }
        @PostMapping("/buy-payment")
        public String upiPaymentPage(@RequestParam String productName,
                                     @RequestParam String productPrice,
                                     @RequestParam String upiId,
                                     Model model) {

            model.addAttribute("productName", productName);
            model.addAttribute("productPrice", productPrice);
            model.addAttribute("upiId", upiId);
            model.addAttribute("confirmationMessage", "UPI Payment initiated!");

            return "payment-confirmation";
        }
}