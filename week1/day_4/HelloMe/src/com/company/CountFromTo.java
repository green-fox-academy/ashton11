package com.company;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        System.out.println("Tell the computer 2 numbers!\n" + "Number 1:");
        Scanner counter = new Scanner(System.in);
        int no1 = counter.nextInt();
        System.out.println("Number 2:");
        int no2 = counter.nextInt();
        if (no1>no2) {
            System.out.println("The second number should be bigger!");
        } else {
            while(no2!=no1) {
                System.out.println(no1);
                no1++;
            }

        }
    }
}
