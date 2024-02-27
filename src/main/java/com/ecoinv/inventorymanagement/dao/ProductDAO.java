package com.ecoinv.inventorymanagement.dao;

import com.ecoinv.inventorymanagement.model.Product;

import java.util.List;

public interface ProductDAO {
    void saveProduct(Product product);
    Product findProductById(String id);
    List<Product> listAllProducts();
}