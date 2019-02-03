package com.company.refactorio;

public class Refactorio {
    public static void main(String[] args) {
        int fact = 6;
        System.out.println(refact(fact));
}
    public static int refact (int fact) {
        if (fact <= 1){
            return fact;
        }else {
            return fact*refact(fact-1);
        }
    }
}
