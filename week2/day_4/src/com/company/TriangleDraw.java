package com.company;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import javax.swing.*;

import java.awt.*;

import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleDraw {

    public static void mainDraw(Graphics triangle) {
        int[] xpointsnull = {166 , 154 , 160 } ;
        int[] ypointsnull = {10 , 10 , 0 };
        int npointsnull = 3;
        triangle.drawPolygon(xpointsnull , ypointsnull , npointsnull );
       //páratlan háromszögek növekedése pontok alapján

        int[] xpoints = { 142 , 178 , 172 , 166 , 160 , 154 , 148 };
        int[] ypoints = { 20 , 20 , 10 , 20 , 10 , 20 , 10 };
        int npoints = 7 ;
        triangle.drawPolygon(xpoints , ypoints , npoints);
        //néggyel történik
        //az első két x koordináta az alaphossza, utána az előző tízzel magasított koordinátát növeltem tizenkettővel
                            //130 , 190 , 184 , 178 , 172 , 166 , 160 , 154 , 148 , 142 , 136
        int[] xpointsnew = {xpoints[0] -12 , xpoints[1] + 12, xpoints[2] +12, xpoints[2] + 6, xpoints[2], xpoints [3], xpoints[4], xpoints[5], xpoints[xpoints.length-1], xpoints[xpoints.length-1] - 6 , xpoints[xpoints.length-1] - 12};
        int[] ypointsnew = {ypoints[0] + 10, ypoints[1] + 10, ypoints[2] + 10, ypoints[3] + 10, ypoints[4] + 10, ypoints[5] + 10, ypoints[6] + 10 , 30 , 20 , 30 , 20 };
        int npointsnew = 11 ;
        triangle.drawPolygon(xpointsnew,ypointsnew,npointsnew);

       // ArrayList <Integer> xpoint = xyadd(xpoints, ypoints, npoints);

        //0-31 sor fori 1
        // 1-32 oszlop for 2 magasság = alapszor √3 / 2


    }

    /*public static ArrayList<Integer> xyadd(int[] xs, int[] ys, int ns) {
        int [] extra = ;
        int [] yxtra = {};
        for (int row = 0; row < 31; row++) {
            for (int column = 0; column < 31; column++) {
                if (row % 2 == 0) {

                    ns += 2;
                } else {

                }
            }

        }
    }*/


        static int WIDTH = 320;
        static int HEIGHT = 320;

        public static void main (String[]args){
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


