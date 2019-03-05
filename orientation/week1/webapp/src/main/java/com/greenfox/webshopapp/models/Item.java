package com.greenfox.webshopapp.models;

public class Items {
    String name;
    String description;
    int price;
    int amountInStock;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    public Items(String name, String description, int price, int amountInStock){
        this.name = name;
        this.amountInStock = amountInStock;
        this.description = description;
        this.price = price;

    }
}
