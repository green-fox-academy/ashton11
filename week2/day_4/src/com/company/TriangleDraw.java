package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleDraw {

    public static void mainDra(Graphics triangle) {
        int xleft = 80;
        int yleft = HEIGHT;
        int xmid = 160;
        int ymid = 160;
        int xright = 240;
        int yright = HEIGHT;
        drawLineLeftToRight(xmid, ymid, xright, yright, triangle);
        drawLineRightToLeft(xmid, ymid, xleft, yleft, triangle);
    }

    public static void drawLineLeftToRight(int xmid, int ymid, int xleft, int yright, Graphics g) {
        for (int i = 0; i < 10; i++) {
            g.setColor(Color.BLUE);
            g.drawLine(xmid, ymid, xleft, yright);
            xmid += 16;
            ymid += 16;
            xleft += 8;

        }
    }

    public static void drawLineRightToLeft(int xmid, int ymid, int xright, int yright, Graphics g) {
        for (int i = 0; i < 10; i++) {
            g.setColor(Color.RED);
            g.drawLine(xmid, ymid, xright, yright);
            xmid += 16;
            ymid += 16;
            xright -= 8;
        }


    }

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
            mainDra(graphics);
        }
    }
}



