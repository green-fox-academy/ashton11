package com.company;
import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList g, ArrayList b) {
        ArrayList<String> matchMade = new ArrayList<>();
        for (int i = 0; i < g.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (i == j) {
                    matchMade.add(g.get(i).toString());
                    matchMade.add(b.get(i).toString());
                    }


                }



            }
        if (b.size()- g.size() > 0) {
            for (int k = 0; k < b.size()-g.size() ; k++) {
                matchMade.add(b.get(b.size()-(k+1)).toString());
            }
        }
        return matchMade;
    }
}