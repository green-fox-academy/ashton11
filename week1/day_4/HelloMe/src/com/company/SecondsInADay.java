package com.company;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int allSeconds = 24*60*60;
        int remainingHours = (allSeconds - (currentHours*3600))/3600;
        int remainingMinutes = (allSeconds/24 - (currentMinutes*60))/60;
        int remainingSeconds = (allSeconds/(24*60) - (currentSeconds));
        System.out.println(remainingHours + ":"+remainingMinutes +":"+ remainingSeconds);
    }
}
