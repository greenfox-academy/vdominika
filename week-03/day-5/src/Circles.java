import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
    public static void mainDraw(Graphics graphics) {

        circle(40, 40, 50, 50, graphics);
    }
    private static void circle(double i, double i1, double i2, double i3, Graphics g) {
        g.setColor (Color.green);
        g.drawOval (0, 0, 500, 500);
        g.drawOval (125, 0, 250, 250);
        g.drawOval (185, 0, 125, 125);

        g.drawOval (0, 225, 250, 250);

        g.drawOval (275, 225, 250, 250);
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
