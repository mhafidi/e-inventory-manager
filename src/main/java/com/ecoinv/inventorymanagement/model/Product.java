package com.ecoinv.inventorymanagement.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String id; // Unique identifier, e.g., SKU
    private String name;
    private String category;
    private List<PriceDetail> prices; // List to hold multiple prices from different sources
    private String description; // Optional

    public Product(String id, String name, String category, String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.prices = new ArrayList<>();
    }
}
