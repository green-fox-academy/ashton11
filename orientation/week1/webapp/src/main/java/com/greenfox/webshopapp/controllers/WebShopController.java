package com.greenfox.webshopapp.controllers;



import com.greenfox.webshopapp.models.Item;
import com.greenfox.webshopapp.models.ItemList;
import com.greenfox.webshopapp.models.ItemPriceComparator;
import com.greenfox.webshopapp.models.MostExpensiveItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;


@Controller
public class WebShopController {
    ItemList itemList = new ItemList();


    public WebShopController(){
        Item runningShoe = new Item("Running Shoes", "Nike running shoes for everyday sports",
                1000,5);
        itemList.addToItemList(runningShoe);
        Item printer = new Item("Printer", "Some HP printer that will print papers", 3000,
                2);
        itemList.addToItemList(printer);
        Item coca = new Item("Coca-Cola", "0,5l standard coke for snorts", 1000, 0);
        itemList.addToItemList(coca);
        Item fokin = new Item("Wokin", "Chicken with fried rice and FOKIN sauce", 119,
                100);
        itemList.addToItemList(fokin);
        Item tshit = new Item("T-shirt", "Blue with corgi on a pike", 300, 1);
        itemList.addToItemList(tshit);
    }


    @RequestMapping(value = "/webshop")
    public String webshop(Model model){
        model.addAttribute("items", itemList.getItemList());
        return "web_shop_front";
    }
    @RequestMapping(value = "/search")
    public String search(Model model, @RequestParam String searched){
        model.addAttribute("items", itemList.searchedFor(searched));
        return "web_shop_front";
    }
    @RequestMapping(value ="/onlyavailable")
    public String available(Model model){
        model.addAttribute("items", itemList.onlyAvailable());
        return "web_shop_front";
    }
    @RequestMapping(value = "/cheapestfirst")
    public String cheap(Model model){
        List<Item>cheapList = (List<Item>) itemList.getItemList().stream()
                .sorted(new ItemPriceComparator())
                .collect(Collectors.toList());
        model.addAttribute("items", cheapList);
        return "web_shop_front";
    }
    @RequestMapping(value = "/containsnike")
    public String nike(Model model){
        model.addAttribute("items",itemList.nike());
        return "web_shop_front";
    }
    @RequestMapping(value = "/averagestock")
    public String average(Model model){
        model.addAttribute("items", itemList.averageStock());
        return "average_stock";
    }
    @RequestMapping(value = "/mostexpensive")
    public String pleb(Model model){
        Item plebItem = (Item) itemList.getItemList().stream()
                .sorted(new MostExpensiveItem())
                .findFirst()
                .get();
        model.addAttribute("items", plebItem);
        return "web_shop_front";
    }
}
