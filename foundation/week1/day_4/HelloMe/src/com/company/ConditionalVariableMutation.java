package com.company;

public class ConditionalVariableMutation {

    public static void main(String[] args) {
        double a = 24;
        int out = 0;
        if (a%2==0) {
            out++;
        }
        System.out.println(out);

        int b = 13;
        String out2 = "";
        if (10<b || b<20){
            out2 = "Sweet!";
        } else if (b<10) {
            out2 = "Less!";
        } else {
            out2 = "More!";
        }
        System.out.println(out2);

        int c = 123;
        int credits = 100;
        boolean isBonus = false;

        if (isBonus == true) {
            c = c;
        } else if ((credits<50) && (isBonus == false)) {
            c -=1;
        } else if((credits>=50) && (isBonus == false)) {
                c -=2;
        }
        System.out.println(c);

        int d = 8;
        int time = 120;
        String out3 = "";
        if (time > 200) {
            out3 = "Time out";
        } else if (d%4==0 && time<200){
            out3 = "Check";
        } else {
            out3 = "Run Forest Run!";
        }
        System.out.println(out3);
    }


}