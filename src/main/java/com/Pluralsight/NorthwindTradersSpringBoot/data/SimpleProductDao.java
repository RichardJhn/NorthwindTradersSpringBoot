package com.Pluralsight.NorthwindTradersSpringBoot.data;

import com.Pluralsight.NorthwindTradersSpringBoot.Models.Product;

import java.util.ArrayList;
import java.util.List;

//@Component
public class SimpleProductDao implements ProductDao {

    public SimpleProductDao(){
        add(new Product(1, 12, "Fruit", "fruit"));
        add(new Product(2, 2, "Fruit", "fruit"));
        add(new Product(3, 3, "Fruit", "fruit"));
        add(new Product(4, 13, "Meat", "meat"));

    }

    List<Product> products = new ArrayList<>();

    int counter = 1;

    @Override
    public int add(Product product) {
        product.setProductId(counter++);
        products.add(product);
        return product.getProductId();
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
