package com.company;

public class PrintEven {
    public static void main(String[] args) {
        for(int e=0;e<499;e++){
            if (e%2==0) {
                System.out.println(e);
            } else {
                System.out.println("");
            }
        }
    }
}
