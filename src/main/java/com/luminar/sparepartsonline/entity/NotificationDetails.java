package com.luminar.sparepartsonline.entity;


import jakarta.persistence.*;

@Entity
@Table(name="notification_details")
public class NotificationDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer notifyId;
    private Integer userId;
    private Integer productId;
    private Long requestDate;
    private Integer notified;

    public NotificationDetails(Integer notifyId, Integer userId, Integer productId, Long requestDate, Integer notified) {
        this.notifyId = notifyId;
        this.userId = userId;
        this.productId = productId;
        this.requestDate = requestDate;
        this.notified = notified;
    }

    public Integer getNotifyId() {
        return notifyId;
    }
    public void setNotifyId(Integer notifyId) {
        this.notifyId = notifyId;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public Long getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Long requestDate) {
        this.requestDate = requestDate;
    }
    public Integer getNotified() {
        return notified;
    }

    public void setNotified(Integer notified) {
        this.notified = notified;
    }


}
