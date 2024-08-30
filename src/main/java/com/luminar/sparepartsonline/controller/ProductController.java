package com.luminar.sparepartsonline.controller;

import com.luminar.sparepartsonline.entity.Product;
import com.luminar.sparepartsonline.repository.ProductRepository;
import com.luminar.sparepartsonline.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
@Controller

public class ProductController {

    @Autowired
    private ProductService productService;


}
