package com.example.SpringBootDemoApp.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_products")
public class Product {
    @Id
    @Column(name="p_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productID;
    private String productName;
    private double price;
    private String description;
    public Product(){

    }

    public Product(int productID, String productName, double price, String description) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
