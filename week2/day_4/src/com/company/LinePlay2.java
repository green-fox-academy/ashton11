import sun.plugin2.util.ColorUtil;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay2 {

    public static void mainDraw(Graphics LinePlay) {
        int pointSpace = 16;
        int numberOfLines = WIDTH/pointSpace;
        int divider = 8;
        int starter = 0;


        lineDrawing(starter, numberOfLines, pointSpace, divider, LinePlay);


        }






    public static void lineDrawing (int starter ,  int pointspace , int numberoflines , int divider , Graphics graphics){
        int end = WIDTH/divider;
        for (int k = 0; k < divider; k++) {
            int Ychanger = end * k;
            for (int i = 0; i < divider ; i++) {
                int Xchanger = end * i;
                for (int j = 0; j <= numberoflines; j++) {
                    graphics.setColor(Color.GREEN);
                    int pointSpaceChange = (pointspace / divider) * j;
                    graphics.drawLine(starter + Xchanger, pointSpaceChange + Ychanger, pointSpaceChange + Xchanger, end + Ychanger);
                }
                for (int j = 0; j <= numberoflines; j++) {
                    graphics.setColor(Color.magenta);
                    int pointSpaceChange = (pointspace / divider) * j;
                    graphics.drawLine(end + Ychanger, pointSpaceChange + Xchanger, pointSpaceChange + Ychanger, starter + Xchanger);
                }

            }


        }
    }





    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main (String[]args){
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        LinePlay2.ImagePanel panel = new LinePlay2.ImagePanel();
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
