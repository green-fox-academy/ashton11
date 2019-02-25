package com.company;

public class Chinchilla {
    public static void main(String[] args) {
        String typo = "Chinchill";
        appendAFunc(typo);
    }
    public static String appendAFunc(String plusA){
        System.out.println(plusA + "a");
        return plusA;
    }
}
