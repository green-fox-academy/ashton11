package com.company.counter;

public class Counter {
    public static void main(String[] args) {
       countTill(10);
    }
    public static void countTill(int n){
        System.out.println(n);
        if ( n > 0 ) {
            countTill(n-1);
        }
    }
}
