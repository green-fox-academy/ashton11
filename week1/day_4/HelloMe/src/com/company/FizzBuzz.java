package com.company;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int fizzbuzz =0; fizzbuzz<101; fizzbuzz++){
            if (fizzbuzz%3==0 && fizzbuzz%5==0){
                System.out.println("FizzBuzz");
            }else if(fizzbuzz%3==0){
                System.out.println("Fizz");
            }else if(fizzbuzz%5==0){
                System.out.println("Buzz");
            } else {
                System.out.println(fizzbuzz);
            }
        }
    }
}
