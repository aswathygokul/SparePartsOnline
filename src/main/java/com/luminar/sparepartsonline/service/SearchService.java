package com.luminar.sparepartsonline.service;

import com.luminar.sparepartsonline.entity.Product;
import com.luminar.sparepartsonline.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    private final ProductRepository productRepository;

    @Autowired
    public SearchService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findResults(String query) {
        return productRepository.findByProductNameContainingIgnoreCase(query);
    }
}
