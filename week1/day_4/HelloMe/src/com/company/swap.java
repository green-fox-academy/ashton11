package com.company;

public class swap {
    public static void main (String args[]) {
        int a = 123;
        int b = 526;
        a= b-a;
        b= b-a;
        a= a+b;
        System.out.println(a);
        System.out.println(b);
    }
}
