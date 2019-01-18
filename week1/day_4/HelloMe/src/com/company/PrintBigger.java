package com.company;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        System.out.println("Give me two numbers, and I will tell you which is bigger!\n" +
                "Number 1: ");
        Scanner Alpha = new Scanner(System.in);
        int A = Alpha.nextInt();
        System.out.println("Number 2: ");
        Scanner Beta = new Scanner(System.in);
        int B = Beta.nextInt();
        if (A<B){
            System.out.println(B);
        } else {
            System.out.println(A);
        }
    }
}
