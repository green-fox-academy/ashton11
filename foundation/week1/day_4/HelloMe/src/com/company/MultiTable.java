package com.company;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        System.out.println("Type a multiplier: ");
        Scanner multiplier = new Scanner(System.in);
        int multi1 = multiplier.nextInt();
        for (int m2 = 0; m2 < 10; m2++) {
            System.out.println( (m2 + 1) + " * " + multi1 + " = " + ((m2 + 1) * multi1));
        }
    }
}
