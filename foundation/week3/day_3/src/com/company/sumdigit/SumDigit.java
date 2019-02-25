package com.company.sumdigit;

public class SumDigit {
    public static void main(String[] args) {
        int n = 17627;
        System.out.println(sumOfDigits(n));

    }

    public static int sumOfDigits(int n) {
        int summed = n%10;
        int newN = n/10;
            if(n > 0) {
            summed += sumOfDigits(newN);
            }
        return summed;
    }

}


