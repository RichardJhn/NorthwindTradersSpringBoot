package com.Pluralsight.NorthwindTradersSpringBoot.data;

import com.Pluralsight.NorthwindTradersSpringBoot.Models.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
    int add(Product product);
    List<Product> getAll() throws SQLException;

}