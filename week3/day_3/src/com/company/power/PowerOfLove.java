package com.company.power;

import java.util.Scanner;

public class PowerOfLove {
    public static void main(String[] args) {
        System.out.println("Give a number you wish to power: ");
        Scanner scanner = new Scanner(System.in);
       int base = scanner.nextInt();
        System.out.println("Give power of love to it: ");
       int power = scanner.nextInt();
        System.out.println(power(base , power));
    }
    public static int power(int base , int power){
        int poweredUpNumber = base;
        power--;
            if (power > 0 && base > 0){
               poweredUpNumber *= power(base , power );
            } else if (base < 0){
                System.out.println("You cheeky bastard, trying to power negative numbers are ya!");
            }
    return poweredUpNumber;
    }
}
