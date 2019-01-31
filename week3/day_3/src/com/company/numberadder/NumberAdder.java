package com.company.numberadder;

public class NumberAdder {
    public static void main(String[] args) {
        int n = 3   ;
        System.out.println(numberAdder(n));
    }

public static int numberAdder(int n) {
        int added = 0;
        if (n > 0) {
            added = n + numberAdder(n-1);
            }
    return added;
    }
}