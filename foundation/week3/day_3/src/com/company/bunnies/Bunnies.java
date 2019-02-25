package com.company.bunnies;

import java.util.Scanner;

public class Bunnies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many bunnies do you have?");
        int n = scanner.nextInt();
        System.out.println(earCounter(n));
    }
    public static int earCounter (int numberOfBunnies){
        int numberOfEars = 2;
        numberOfBunnies--;
            if (numberOfBunnies > 0){
                numberOfEars += earCounter(numberOfBunnies);
            }
        return numberOfEars;
    }
}
