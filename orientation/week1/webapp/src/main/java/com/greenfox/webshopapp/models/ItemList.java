package com.greenfox.webshopapp.models;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ItemList {
    List<Item> itemList = new ArrayList<>();


    public ItemList() {
    }

    public List<Item> addToItemList(Item item) {
        itemList.add(item);
        return itemList;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public List<Item> onlyAvailable() {
        return itemList.stream()
                .filter(item -> item.getAmountInStock() > 0)
                .collect(Collectors.toList());
    }

    public List<Item> searchedFor(String searchingFor) {
        return itemList.stream()
                .filter(item -> item.getName().contains(searchingFor) ||
                        item.getDescription().contains(searchingFor))
                .collect(Collectors.toList());
    }

    public List<Item> nike() {
        return itemList.stream()
                .filter(item -> item.getName().contains("Nike") || item.getDescription().contains("Nike"))
                .collect(Collectors.toList());
    }

    public double averageStock() {
        return itemList.stream()
                .mapToDouble(item -> item.getAmountInStock())
                .average()
                .getAsDouble();
    }
}