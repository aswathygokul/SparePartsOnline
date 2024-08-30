package com.luminar.sparepartsonline.repository;

import com.luminar.sparepartsonline.entity.Product;
import com.luminar.sparepartsonline.entity.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailsRepository extends JpaRepository<ProductDetails,Long> {
}
