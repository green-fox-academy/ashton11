package com.company;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Give me a number and I'll tell you if it is odd or even:");
        Scanner Oddity = new Scanner(System.in);
        int od= Oddity.nextInt();
        if (od%2!=0){
            System.out.println("Your number is odd!");
        } else {
            System.out.println("Your number is even!");
        }
    }
}
