package com.company;

public class Sum {
    public static void main(String[] args) {
        int para = 8;
        int summa = sum(para);
        System.out.println(summa);
    }
    public static int sum(int till){
        int tilla = 0;
        for (int i= 0; i < till; i++) {
            tilla += i;
        }
        return tilla;
    }
}
