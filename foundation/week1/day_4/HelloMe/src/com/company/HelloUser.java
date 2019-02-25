package com.company;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Please type in your name:");
        Scanner namer = new Scanner(System.in);
        String name = namer.nextLine();
        System.out.println("Hello " + name);
    }
}
