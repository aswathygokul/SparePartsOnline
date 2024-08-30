package com.luminar.sparepartsonline.service;


import com.luminar.sparepartsonline.entity.NotificationDetails;
import com.luminar.sparepartsonline.repository.NotificationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationDetailsService {

    @Autowired
    private NotificationDetailsRepository notificationDetailsRepository;

    public List<NotificationDetails> getAllNotifications() {
        return notificationDetailsRepository.findAll();
    }

    public NotificationDetails getNotificationById(Long id) {
        return notificationDetailsRepository.findById(id).orElse(null);
    }
}
