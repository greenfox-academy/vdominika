import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        graphics.setColor(Color.RED);
        graphics.drawRect(50, 50, 20, 30);
        graphics.setColor(Color.black);
        graphics.drawRect(100, 50, 20, 40);
        graphics.setColor(Color.green);
        graphics.drawRect(50, 150, 30, 10);
        graphics.setColor(Color.yellow);
        graphics.drawRect(150, 150, 40, 20);
    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}