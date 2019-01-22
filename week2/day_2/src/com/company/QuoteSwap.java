package com.company;
import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("What" , "I" , "do" , "create," , "I" , "cannot" , "not" , "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        quoteSwap(list);
        // Expected output: "What I cannot create I do not understand."

    }
    public static ArrayList quoteSwap(ArrayList quote){
        String change = quote.get(2).toString();
        quote.set(2 , quote.get(5));
        quote.set(5 , change);
        System.out.println(quote.toString());
    return quote;
    }
}