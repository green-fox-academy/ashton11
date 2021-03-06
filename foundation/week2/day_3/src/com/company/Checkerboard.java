package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int x = 0;
        int y = 0;

        drawCheckers( x , y , graphics );

    }



    public static void drawCheckers(int x , int y , Graphics g4){

        for (int i = 0; i < 8 ; i++) {
            for (int j = 0; j < 8 ; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        g4.setColor(Color.WHITE);
                        g4.fillRect(x, y, WIDTH / 8, HEIGHT / 8);
                        x += WIDTH / 8;
                    } else {
                        g4.setColor(Color.BLACK);
                        g4.fillRect(x, y, WIDTH / 8, HEIGHT / 8);
                        x += WIDTH / 8;
                    }
                }else{
                    if (j % 2 == 0) {
                        x -= WIDTH / 8;
                        g4.setColor(Color.WHITE);
                        g4.fillRect(x, y, WIDTH / 8, HEIGHT / 8);

                    } else {
                        x -= WIDTH / 8;
                        g4.setColor(Color.BLACK);
                        g4.fillRect(x, y, WIDTH / 8, HEIGHT / 8);

                    }

                }
            }
            y += HEIGHT / 8;

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