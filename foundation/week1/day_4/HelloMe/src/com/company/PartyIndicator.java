package com.company;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        System.out.println("The number of girls coming to the party:");
        Scanner GG = new Scanner(System.in);
        int girls = GG.nextInt();
        System.out.println("The number of boys coming to the party:");
        Scanner BB = new Scanner(System.in);
        int boys = BB.nextInt();
        if (girls==0){
            System.out.println("Sausage party");
        } else if ((boys!=girls) && ((boys+girls)>=20)){
            System.out.println("Quite a cool party!");
        } else if ((boys==girls)&&((boys+girls)>=20)) {
            System.out.println("The party is excellent!");
        } else {
            System.out.println("Average party...");
        }
    }
}
