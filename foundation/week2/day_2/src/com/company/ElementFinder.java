package com.company;

import java.util.*;

public class ElementFinder{
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        containsSeven(arrayList);
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

    }
    public static ArrayList containsSeven(ArrayList seven){
            if(seven.contains(7)) {
                System.out.println("Hooray");
            } else {
                System.out.println("Noooooo");

            } return seven;
    }
}
