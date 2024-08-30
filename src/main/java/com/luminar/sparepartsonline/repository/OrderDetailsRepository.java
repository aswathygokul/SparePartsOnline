package com.luminar.sparepartsonline.repository;

import com.luminar.sparepartsonline.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Long> {

}
