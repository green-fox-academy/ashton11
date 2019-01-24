package com.company;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        int x = 0;
        int y = 0;
        toTheCenter(x,y,graphics);


    }
    public static void toTheCenter(int x , int y , Graphics g5 ){
        for (int i = 0; i < WIDTH/8 ; i++) {
            for (int j = 0; j < HEIGHT/8; j++) {
                if ( x <= WIDTH ) {
                    g5.drawLine( x , y , WIDTH / 2 , HEIGHT / 2 );
                    x += 20;
                } else if ( y <= HEIGHT ) {
                    g5.drawLine( x , y , WIDTH / 2 , HEIGHT / 2 );
                    y += 20;
                } else if (j > HEIGHT/16 ) {
                    g5.drawLine( x , y , WIDTH / 2 , HEIGHT / 2);
                    x -= 20;
                } else if ( i > WIDTH/16 ){
                    g5.drawLine( x , y , WIDTH / 2 , HEIGHT / 2 );
                    y -= 20;
                }
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