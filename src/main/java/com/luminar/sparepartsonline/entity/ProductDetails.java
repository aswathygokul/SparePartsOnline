package com.luminar.sparepartsonline.entity;


import jakarta.persistence.*;

@Entity
@Table(name="product_details")
public class ProductDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer productId;
    private String productName;
    private String productBrand;
    private String productModel;
    private Integer productYear;
    private Double productPrice;
    private Boolean availability;
    private String image;

    public ProductDetails() {
    }

    public ProductDetails(String productName, String productBrand, String productModel, Integer productYear, Double productPrice, Boolean availability,String image) {
        this.productName = productName;
        this.productBrand = productBrand;
        this.productModel = productModel;
        this.productYear = productYear;
        this.productPrice = productPrice;
        this.availability = availability;
        this.image = image;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }


    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public Integer getProductYear() {
        return productYear;
    }

    public void setProductYear(Integer productYear) {
        this.productYear = productYear;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public String setAvailability(Boolean availability) {
        this.availability = availability;

        return null;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
