package com.luminar.sparepartsonline.repository;

import com.luminar.sparepartsonline.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByProductNameContainingIgnoreCase(String productName);

    Optional<Product>findByProductId(Long productId);

}
