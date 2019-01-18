package com.company;

public class CodingHours {
    public static void main(String args[]) {
        int daily = 6;
        int semester =17;
        int workdays = 5;
        int codehours = semester*workdays*daily ;
        int weekly = 17*52;
        float percent = codehours/weekly;
        System.out.println(codehours);
        System.out.println(percent);
    }
}
