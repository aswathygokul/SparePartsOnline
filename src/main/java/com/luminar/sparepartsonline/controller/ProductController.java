package com.luminar.sparepartsonline.controller;


import com.luminar.sparepartsonline.entity.Product;
import com.luminar.sparepartsonline.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {


    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String getAllProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "product-list";
    }

    @GetMapping("/products/{id}")
    public String getProductByProductId(@PathVariable Long id, Model model) {
        Product product = productService.getProductByProductId(id);
        model.addAttribute("product", product);
        return "product";
    }

    @GetMapping("/sell-old-parts")
    public String showSellOldPartsPage() {
        return "sell-old-parts";
    }

    @PostMapping("/sell-old-parts")
    public String handleSellOldParts(
            @RequestParam("productName") String productName,
            @RequestParam("productBrand") String productBrand,
            @RequestParam("productModel") String productModel,
            @RequestParam("productYear") int productYear,
            @RequestParam("productPrice") double productPrice,
            @RequestParam("availability") Boolean availability,
            @RequestParam("file") MultipartFile file,
            RedirectAttributes redirectAttributes) {

        // Create a new product entity and set the form data
        Product product = new Product();
        product.setProductName(productName);
        product.setProductBrand(productBrand);
        product.setProductModel(productModel);
        product.setProductYear(productYear);
        product.setProductPrice(productPrice);
        product.setAvailability(availability);

        // Save the product and the uploaded file

        Product savedProduct = productService.saveProduct(product, file);

        if (savedProduct != null) {
            redirectAttributes.addFlashAttribute("message", "Product uploaded successfully!");
        } else {
            redirectAttributes.addFlashAttribute("message", "Failed to upload product.");
        }

        return "redirect:/sell-old-parts";
    }

}
