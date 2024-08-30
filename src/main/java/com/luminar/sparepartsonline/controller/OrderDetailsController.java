package com.luminar.sparepartsonline.controller;


import com.luminar.sparepartsonline.entity.OrderDetails;
import com.luminar.sparepartsonline.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class OrderDetailsController {

    @Autowired
    private OrderDetailsService orderDetailsService;

    @GetMapping("/orders")
    public String getAllOrders(Model model) {
        List<OrderDetails> orders = orderDetailsService.getAllOrders();
        model.addAttribute("orders", orders);
        return "order-list"; // This is the view name
    }

    @GetMapping("/orders/{id}")
    public String getOrderById(@PathVariable Long id, Model model) {
        OrderDetails order = orderDetailsService.getOrderById(id);
        model.addAttribute("orders", order);
        return "order-details";
    }
}
