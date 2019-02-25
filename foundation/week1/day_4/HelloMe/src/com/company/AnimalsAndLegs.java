package com.company;
import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        System.out.println("Please type in the no of chickens you have: ");
        Scanner chicks = new Scanner(System.in);
        int chicken = chicks.nextInt();
        System.out.println("Please type in the no of pigs you have: ");
        Scanner piglets = new Scanner(System.in);
        int pig = piglets.nextInt();
        int legs = (chicken*2) + (pig*4);
        System.out.println("The no of legs the animals have: " + legs);
    }
}
