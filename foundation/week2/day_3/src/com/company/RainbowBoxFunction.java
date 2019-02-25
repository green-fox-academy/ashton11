package com.company;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;
import sun.plugin2.util.ColorUtil;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        Color red = new Color(255 , 0 , 0 );
        Color orange = new Color(255 , 127, 0 );
        Color yellow = new Color(255 , 255 , 0 );
        Color green = new Color(0 , 255 , 0 );
        Color blue = new Color(0 , 0 , 255 );
        Color indigo = new Color(75 , 0 , 130 );
        Color violet = new Color(148 , 0 , 211 );
        Color colorchanger [] = { red , orange , yellow , green , blue , indigo , violet };
        int size = 14;
        rainbowSquare(size,colorchanger,graphics);

    }
    public static void rainbowSquare(int s2, Color [] color , Graphics g2){

        int x = 0 ;
        int y = 0 ;
        int s3 = WIDTH;


        for (int i = 0; i < color.length ; i++) {
            g2.setColor(color[i]);
            g2.fillRect(x, y, s3 , s3);
            x += (WIDTH-s2)/14;
            y += (HEIGHT-s2)/14;
            s3 -= (WIDTH-s2)/7;

        }

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
