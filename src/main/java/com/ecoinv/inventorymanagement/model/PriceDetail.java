package com.ecoinv.inventorymanagement.model;

import java.util.List;

public  class PriceDetail {
    private double price;
    private String currency;
    private double tax;
    private String source;

    public PriceDetail(double price, String currency, double tax, String source) {
        this.price = price;
        this.currency = currency;
        this.tax = tax;
        this.source = source;
    }

    // Getters and Setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}

