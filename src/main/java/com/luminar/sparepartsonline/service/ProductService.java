package com.luminar.sparepartsonline.service;


import com.luminar.sparepartsonline.entity.Product;
import com.luminar.sparepartsonline.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;

    public List<Product> searchProducts(String query) {

        return productRepository.findByNameContainingIgnoreCase(query);
    }


}
