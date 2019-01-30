package com.company.sharpie;

public class Sharpie {
    String color;
    float width;
    float inkAmount;
    public Sharpie (String color , float width){
        this.color = color;
        this.width = width;
        inkAmount = 100f;
    }public void use(){
        inkAmount -= 10f * width;
    }
    public void checkInkAmount () {
        System.out.println("Your pen has " + inkAmount + " ink left.");
    }
}
