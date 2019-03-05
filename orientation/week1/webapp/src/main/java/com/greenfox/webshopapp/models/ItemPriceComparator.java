package com.greenfox.webshopapp.models;

import java.util.Comparator;

public class ItemPriceComparator implements Comparator {

    @Override
    public int compare(Object item1,Object item2) {
        Integer firstPrice = ((Item)item1).getPrice();
        Integer secondPrice = ((Item)item2).getPrice();
        return (firstPrice.compareTo(secondPrice));
    }
}
