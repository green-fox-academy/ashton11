package com.company;

import com.sun.xml.internal.fastinfoset.util.CharArray;

public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(reverse(reversed));
    }
    public static String reverse(String bat){
        String rev2 = "";
        for (int i = 0; i < bat.length() ; i++) {
            char first = bat.charAt((bat.length()-1)-i);
            rev2 += first;
        }
        return rev2;

    }
}