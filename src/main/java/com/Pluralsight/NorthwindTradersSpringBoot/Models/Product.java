package com.Pluralsight.NorthwindTradersSpringBoot.Models;

public class Product {
    private int productID;
    private String name;
    private String category;
    private double price;

    public Product{
        //do nothing
    }

    public Product(double price, int productID, String name, String category) {
        this.price = price;
        this.productID = productID;
        this.name = name;
        this.category = category;
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
}
