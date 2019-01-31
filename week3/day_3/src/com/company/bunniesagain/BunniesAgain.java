package com.company.bunniesagain;

public class BunniesAgain {
    public static void main(String[] args) {
        int numberOfBunnies = 5;
        System.out.println(earCounter2(numberOfBunnies));
    }
    public static int earCounter2 (int numberOfBunnies) {
        int numberOfEars = 0;
        numberOfBunnies--;

        if (earCounter2(numberOfBunnies) > 0){
            int oddBunnyEars = 2;
            int evenBunnyEars = 3;
            if (numberOfBunnies%2 == 0){
                numberOfEars += evenBunnyEars;
            } else if (numberOfBunnies%2 != 0) {
                numberOfEars += oddBunnyEars;
            }

        }int numberOfEars1 = numberOfEars;
        return numberOfEars1;
    }
}
