package com.company.strings;

public class String3 {
    public static void main(String[] args) {
        String star = "My chars will be divided by stars";
        System.out.println(starDivider(star));
    }

    public static String starDivider(String star) {
        if (star.length() < 1) {
            return star;
        }
        return star.charAt(0) + "*" + starDivider(star.substring(1));

    }
}


