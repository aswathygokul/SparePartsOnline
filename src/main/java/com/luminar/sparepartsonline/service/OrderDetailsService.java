package com.luminar.sparepartsonline.service;


import com.luminar.sparepartsonline.entity.OrderDetails;
import com.luminar.sparepartsonline.repository.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailsService {

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    public List<OrderDetails> getAllOrders() {
        return orderDetailsRepository.findAll();
    }

    public OrderDetails getOrderById(Long id) {
        return orderDetailsRepository.findById(id).orElse(null);
    }

}
