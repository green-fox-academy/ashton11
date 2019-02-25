package com.company.fractaltriangle;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleDrawing {
    public static void mainDraw(Graphics graphics) {
        int baseLength = 320;
        int height = (320/10)*8;
        int topPoint = baseLength/2;
        int numberOfRecursion = 8;
        graphics.drawLine( 0 , 0 , baseLength,0);
        graphics.drawLine(0 , 0 , topPoint , height);
        graphics.drawLine(baseLength, 0 , topPoint , height);
        drawTriangle(graphics, baseLength, height , numberOfRecursion);


    }
    public static void drawTriangle(Graphics g , int baseLength, int height , int numberOfRecursion){
        if(numberOfRecursion >0){
            g.drawLine( baseLength *3/4, height/2 , baseLength /4 ,height/2);
            g.drawLine(baseLength /2 , 0 , baseLength *3/4, height/2);
            g.drawLine(baseLength /2 , 0 , baseLength /4 , height/2);
            drawTriangle( g ,baseLength/2 , height/2  , numberOfRecursion-1);

        }return;


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