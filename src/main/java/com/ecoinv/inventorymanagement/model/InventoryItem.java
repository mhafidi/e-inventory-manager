package com.ecoinv.inventorymanagement.model;

public class InventoryItem {
    private String productName;
    private int currentStock;
    private int threshold;
    private int reorderQuantity;
    private int onOrderStock; // Tracks the quantity of stock that is currently on order

    public InventoryItem(String productName, int currentStock, int threshold, int reorderQuantity) {
        this.productName = productName;
        this.currentStock = currentStock;
        this.threshold = threshold;
        this.reorderQuantity = reorderQuantity;
        this.onOrderStock = 0; // Initially, there is no stock on order
    }

    // Method to increase the current stock
    public void increaseStock(int amount) {
        this.currentStock += amount;
    }

    // Method to decrease the current stock
    public void decreaseStock(int amount) {
        this.currentStock -= amount;
    }

    // Method to increase the on order stock quantity
    public void increaseOnOrderStock(int amount) {
        this.onOrderStock += amount;
    }

    // Getters and setters
    public String getProductName() {
        return productName;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public int getThreshold() {
        return threshold;
    }

    public int getReorderQuantity() {
        return reorderQuantity;
    }

    public int getOnOrderStock() {
        return onOrderStock;
    }

    // Optionally, you can include methods to decrease on order stock, etc.
}

