package com.company;
import java.util.ArrayList;
import java.util.List;

public class Unique {
    public static void main(String[] args) {
            //  Create a function that takes a list of numbers as a parameter
            //  Returns a list of numbers where every number in the list occurs only once

            //  Example
        int[] uniq = unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34});
        for (int uniqe: uniq){
            System.out.print(uniqe + "  ");
        }
            //  should print: `[1, 11, 34, 52, 61]`
    }
    public static int [] unique(int [] uniq){
        List<Integer>uniquer = new ArrayList<>();
        for (int i = 0; i < uniq.length - 1; i++) {
            for (int j = i+1; j < uniq.length ; j++) {
                if(!uniquer.contains(uniq[i])){
                    uniquer.add(uniq[i]);
                }
            }
        }
        int[] uniqueer = new int[uniquer.size()];
        for (int i = 0; i < uniquer.size(); i++) {
            uniqueer[i] = uniquer.get(i);
        }
        return uniqueer;
    }
}

