package com.company;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        System.out.println("How big of a diamond you need?");
        Scanner number = new Scanner(System.in);
        int layers = number.nextInt(); //7
        int space = (layers+1)/2; //3,2,1 0
        int stars = 0; //1,2,3 7
        int l = 0;  //0,1,2,3
        int space2 = 1;
        if (layers%2!=0) {

            while (l<layers+1){

                if (l < (layers / 2)) {
                    stars++;
                    space--;

                    for (int t = 0; t < space; t++) {
                        System.out.print(" ");
                    }

                    for (int s = 0; s < ((stars * 2) - 1); s++) { //1*2-1=1 , 2*2-1=3 , 3*2-1=5
                    System.out.print("*");
                    }
                    System.out.print("\n");

                } else if (l==((layers+1)/2))  {
                    for (int páratlan = 0; páratlan < layers; páratlan++)
                    System.out.print("*");
                    System.out.print("\n");

                } else if (l>(layers/2)) {

                    for (int t2 = 0; t2 < space2; t2++ ) {
                        System.out.print(" ");
                    }

                    for (int s2 = 0; s2 < ((stars*2) - 1); s2++) {
                    System.out.print("*");
                    }
                    System.out.print("\n");
                    stars--;
                    space2++;
                }
                l++;
            }
        }  else {
            while (l<layers+1) {

                if (l < (layers / 2)) {
                    stars++;
                    space--;

                    for (int t = 0; t < space; t++) {
                        System.out.print(" ");
                    }

                    for (int s = 0; s < ((stars * 2) - 1); s++) { //1*2-1=1 , 2*2-1=3 , 3*2-1=5
                        System.out.print("*");
                    }
                    System.out.print("\n");

                } else if (l > (layers / 2)) {

                    for (int t2 = 0; t2 < space2-1; t2++) {
                        System.out.print(" ");
                    }

                    for (int s2 = 0; s2 < ((stars * 2) - 1); s2++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                    stars--;
                    space2++;
                }
                l++;
            }
        }
    }
}
