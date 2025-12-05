package com.Pluralsight.NorthwindTradersSpringBoot;

import com.Pluralsight.NorthwindTradersSpringBoot.Models.Product;

import java.util.ArrayList;
import java.util.List;

public class SimpleProductDao implements ProductDao{

    public SimpleProductDao(){
        add(new Product(1, 1, "Fruit", "Fruit"));
    }

    List<Product> products = new ArrayList<>();
    int counter = 1;

    @Override
    public int add(Product product){
        product.setProductID(counter++);
        products.add(product);
        return product.getProductID();

    }

    @Override
    public List<Product> getAll(){
        return products;
    }
}
