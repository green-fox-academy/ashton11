package com.company.strings;

public class String1 {
    public static void main(String[] args) {
        String xtoy = "Examples were not expected";
        letterChanger(xtoy);
    }
    public static void letterChanger(String xs){
        xs = xs.replace("x" , "y");
        System.out.println(xs);
    }
}
// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.