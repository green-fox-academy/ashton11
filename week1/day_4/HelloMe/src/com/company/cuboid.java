package com.company;

public class cuboid {
    public static void main(String[] args) {
        int length = 10;
        int width = 10;
        int height = 10;
        int surface = (2*(length*width) + 2*(width*height) + 2*(height*length));
        int volume = length*width*height;
        System.out.println("The surface of the cuboid is: " + surface);
        System.out.println("The volume of the cuboid is: " + volume);
    }
}
