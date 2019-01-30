package com.company.postit;

public class PostIt {
    String word;
    String backgroundColor;
    String fontColor;

    public PostIt(String word , String backgroundColor , String fontColor ) {
        this.word = word;
        this.backgroundColor = backgroundColor;
        this.fontColor = fontColor;
    }
    public void writeOutPostIt (){
        System.out.println(word + " " + backgroundColor + " " + fontColor);
    }

}




/*Create a PostIt class that has
        a backgroundColor
        a text on it
        a textColor
        Create a few example post-it objects:
        an orange with blue text: "Idea 1"
        a pink with black text: "Awesome"
        a yellow with green text: "Superb!*/