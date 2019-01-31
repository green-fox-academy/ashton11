package com.company.strings;

public class String2 {
    public static void main(String[] args) {
        String xToBeTaken = "No examples were executed that day";
        xDestroyer(xToBeTaken);
    }
    public static void xDestroyer (String xToBeTaken) {
        String xDestroyed = xToBeTaken.replaceFirst("x" , "");
        if(xDestroyed.contains("x")){
            xDestroyer(xDestroyed);
        } else {
            System.out.println(xDestroyed);
        }
    }
}
