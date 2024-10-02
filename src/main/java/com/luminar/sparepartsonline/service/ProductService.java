package com.luminar.sparepartsonline.service;


import com.luminar.sparepartsonline.entity.Product;
import com.luminar.sparepartsonline.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private  ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductByProductId(Long productId) {

        return productRepository.findByProductId(productId).orElse(null);
    }
    public Product saveProduct(Product product, MultipartFile file) {

        String uploadDir = "uploaded-images/";


        try {
            File uploadFile = new File(uploadDir + file.getOriginalFilename());
            file.transferTo(uploadFile);

            product.setImage(uploadFile.getPath());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return productRepository.save(product);
    }


}
