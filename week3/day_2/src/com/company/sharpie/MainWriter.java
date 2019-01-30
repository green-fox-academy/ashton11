package com.company.sharpie;

public class MainWriter {
    public static void main(String[] args) {
        Sharpie pen = new Sharpie( "blue" , 3.3f );
        pen.use();
        pen.checkInkAmount();
    }
}
