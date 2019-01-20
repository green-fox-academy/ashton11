package com.company;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        System.out.println("How many levels should the pyramid have?");
        Scanner pym = new Scanner(System.in);
        int pyramid = pym.nextInt();
        int s = 1;
        int p = 0;
        while(p<pyramid){
            for (int space = p; space<pyramid; space++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int star = 0; star<((s*2)-1); star++) {
                System.out.print("*");
            }
            System.out.print("\\");
            System.out.print("\n");
            s++;
            p++;
        }
    }
}



