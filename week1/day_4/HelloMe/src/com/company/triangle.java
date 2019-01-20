package com.company;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        System.out.println("How big of a triangle would you like?");
        Scanner lines= new Scanner(System.in);
        int liner = lines.nextInt();
        String star = "*";
        for (int l = 0; l<liner;l++){
            System.out.println(star);
            star += "*";

        }
    }
}
