package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleDraw {

    public static void mainDraw(Graphics triangle) {
        int numberOfLines = 16;
        int xleft = 80;
        int topPoint = WIDTH/2;
        int xright = 240;

        drawLineLeftToRight(topPoint, numberOfLines, xleft, xright, triangle);
        //drawLineRightToLeft(topPoint, xright, xleft, triangle);
    }

    public static void drawLineLeftToRight(int topPoint , int numberOfLines, int xleft , int xright , Graphics g) {
        for (int i = 0; i < numberOfLines ; i++) {
            int topChanger =topPoint/numberOfLines;
            g.setColor(Color.BLUE);
            g.drawLine( xleft + topChanger*i, WIDTH  , xright + (topChanger/2)*i ,topPoint - (topChanger/2)*i);


        }
    }

    /*public static void drawLineRightToLeft(int xmid, int ymid, int xright, int yright, Graphics g) {
        for (int i = 0; i < 10; i++) {
            g.setColor(Color.RED);
            g.drawLine(xmid, ymid, xright, yright);
            xmid += 16;
            ymid += 16;
            xright -= 8;
        }


    }*/

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



