package com.Pluralsight.NorthwindTradersSpringBoot.Models;

public class Product {
    private int productID;
    private String name;
    private String category;
    private double price;

    public Product() {
        //do nothing
    }

    public Product(double price, int productID, String category, String name) {
        this.productID = productID;
        this.price = price;
        this.category = category;
        this.name = name;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductId(int i) {
    }

    public int getProductId() {

        return 0;
    }
}
