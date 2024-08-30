package com.luminar.sparepartsonline.service;


import com.luminar.sparepartsonline.entity.ProductDetails;
import com.luminar.sparepartsonline.repository.ProductDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDetailsService {
    @Autowired
    private ProductDetailsRepository productDetailsRepository;

    public List<ProductDetails> getAllProducts() {
        return productDetailsRepository.findAll();
    }

    public ProductDetails getProductById(Long id) {
        return productDetailsRepository.findById(id).orElse(null);
    }
}
