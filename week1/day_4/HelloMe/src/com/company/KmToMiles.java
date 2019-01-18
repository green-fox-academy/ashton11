package com.company;


import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        System.out.println("Enter the kilometers you want in miles: ");
        Scanner KilM = new Scanner(System.in);
        double Km = KilM.nextDouble();
        double Mi = (Km * 0.621371);
        System.out.println("Your kilometers converted to miles: " + Mi);


    }
}
