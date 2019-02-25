package com.company;

import java.util.Scanner;

public class AvarageOfInput {
    public static void main(String[] args) {
        System.out.println("Tell me a number: ");
        Scanner Number1 = new Scanner(System.in);
        int no1 = Number1.nextInt();
        System.out.println("Tell me another one: ");
        Scanner Number2 = new Scanner(System.in);
        int no2 = Number2.nextInt();
        System.out.println("Tell me another: ");
        Scanner Number3 = new Scanner(System.in);
        int no3 = Number3.nextInt();
        System.out.println("Tell me a fourth number: ");
        Scanner Number4 = new Scanner(System.in);
        int no4 = Number4.nextInt();
        System.out.println("And one more time: ");
        Scanner Number5 = new Scanner(System.in);
        int no5 = Number5.nextInt();
        double average = ((no1 + no2+ no3 + no4 + no5)/5);
        System.out.println("The sum of your numbers: "+ (no1 + no2 + no3 + no4 + no5));
        System.out.println("The average of your numbers: " + average);
    }
}
