package com.ecoinv;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class MockOrderSystem {
    private Map<String, Integer> orders = new HashMap<>();

    public void placeOrder(String productName, int quantity) {
        orders.put(productName, quantity);
    }

    public boolean orderPlacedFor(String productName) {
        return orders.containsKey(productName);
    }

    // Method to retrieve all orders placed
    public Map<String, Integer> getOrders() {
        // Return an unmodifiable view of the orders map to prevent modification
        return Collections.unmodifiableMap(orders);
    }

    public void resetOrders() {
        orders.clear();
    }
}