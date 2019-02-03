package com.company.bunniesagain;

public class BunniesAgain {

    public static void main(String[] args) {
        int numberOfBunnies = 10;
        System.out.println(earCounter2(numberOfBunnies));
    }



    public static int earCounter2 (int numberOfBunnies) {
        int numberOfEars = 0;
        int oddBunnyEars = 2;
        int evenBunnyEars = 3;

        if (numberOfBunnies > 0){
            if (numberOfBunnies%2 == 0){
                numberOfEars = evenBunnyEars + earCounter2(numberOfBunnies-1);
            } else if (numberOfBunnies%2 != 0) {
                numberOfEars = oddBunnyEars + earCounter2(numberOfBunnies-1);
            }
        } return numberOfEars;
    }
}
