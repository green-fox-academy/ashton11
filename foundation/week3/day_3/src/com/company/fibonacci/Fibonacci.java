package com.company.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fibonacciThatNumber(n));
    }


    public static int fibonacciThatNumber (int n ){
        int base1 = 0;
        int base2 = 1;
        int fibonacciNumber = base1 + base2;
        if (n > 0) {
            fibonacciNumber = fibonacciThatNumber(n-1) + fibonacciThatNumber(n-2) ;
        }
    return fibonacciNumber;
    }
}
