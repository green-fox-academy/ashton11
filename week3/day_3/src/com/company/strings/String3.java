package com.company.strings;

public class String3 {
    public static void main(String[] args) {
        String star = "My chars will be divided by stars";
        starDivider(star);
    }
    public static void starDivider(String star){
        StringBuilder charToBeStarred = new StringBuilder(star);
        int insertPoint = 0;
        insertPoint += 2;
        if (insertPoint < star.length()){
            charToBeStarred.insert(insertPoint , '*');

            starDivider(String.valueOf(charToBeStarred));
        } else {
            System.out.println(charToBeStarred.toString());
        }
    }
}
