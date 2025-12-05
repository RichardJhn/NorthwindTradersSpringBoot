package com.Pluralsight.NorthwindTradersSpringBoot;

import com.Pluralsight.NorthwindTradersSpringBoot.Models.Product;

import java.util.List;

public interface ProductDao {
    int add(Product product);
    List<Product> getAll();
}
