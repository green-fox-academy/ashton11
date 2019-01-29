package com.company;

import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {
        System.out.println("Please give a number by which I divide 10 by:");
        Scanner scanner = new Scanner(System.in);
        try {
            double divided = 10 / divider(scanner);
            System.out.println(divided);
        } catch (ArithmeticException ex){
            System.err.println("fail");
        }

    }

    public static double divider(Scanner scanner) {
        return scanner.nextInt();
    }
}
