import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Graphic {


    public static void mainDraw(Graphics graphics) {
        graphics.setColor (Color.yellow);
        graphics.fillRect (0, 0, WIDTH, HEIGHT);
        graphics.setColor (Color.BLACK);
        drawSquares(graphics,0, 0, WIDTH/3, HEIGHT/3);
    }
    public static void drawSquares(Graphics graphics, int x, int y, int width, int height){

        graphics.setColor (Color.BLACK);
        graphics.drawRect(0, 0, WIDTH/3, HEIGHT/3);

    }

    //    Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame ("Drawing");
        jFrame.setSize (new Dimension (WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation (EXIT_ON_CLOSE);
        jFrame.add (new ImagePanel ( ));
        jFrame.setLocationRelativeTo (null);
        jFrame.setVisible (true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent (graphics);
            mainDraw (graphics);

        }
    }
}


