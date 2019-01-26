import sun.plugin2.util.ColorUtil;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay2 {

    public static void mainDraw(Graphics LinePlay) {
        int pointSpace = 16;
        int numberOfLines = WIDTH/pointSpace;
        int starter = 0;

        lineDrawing(starter , numberOfLines , pointSpace , LinePlay);
    }

    public static void lineDrawing (int starter , int pointspace , int numberoflines , Graphics graphics){
        for (int i = 0; i <= numberoflines ; i++) {
            graphics.setColor(Color.GREEN);
            int pointchange = pointspace*i;
            graphics.drawLine(starter , pointchange , pointchange , WIDTH);
        }
        for (int i = 0; i <= numberoflines; i++) {
            graphics.setColor(Color.magenta);
            int pointchange = pointspace*i;
            graphics.drawLine( WIDTH, pointchange , pointchange , starter );
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
