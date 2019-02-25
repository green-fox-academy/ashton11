package com.company;

public class Factorial {
    public static void main(String[] args) {
        int facto = 6;
        int fact = factorio(facto);
        System.out.println(fact);
    }
    public static int factorio(int facta){
        int factor = 1;
            for (int i = 0; i < facta ; i++){
                factor = factor * (i + 1);

            }
        return factor;
    }
}
