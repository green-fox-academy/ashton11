package com.company;

import sun.plugin2.util.ColorUtil;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        int change = 100;
        int x = 13;
        int y = 40;
        int colourchange = 30;
        for (int i = 0; i < 5 ; i++) {
            graphics.setColor(new Color((i*20)+colourchange,(i*30)+colourchange,(i*15)+colourchange));
            if (i<2) {
                int width = 70 ;
                int height = 40;
                graphics.drawRect(x , y , i*width , i*height);
                x += change;
                y += change;

            } else {
                int width = 50;
                int height = 30;
                graphics.drawRect(x , y , i*width , i*height);
                x += change;
                y -= change;
            }
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