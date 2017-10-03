import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Board extends JComponent implements KeyListener {

    Hero theHero;

    int testBoxX;
    int testBoxY;

    public Board() {
        testBoxX = 300;
        testBoxY = 300;

        // set the size of your draw board
        setPreferredSize (new Dimension (720, 720));
        setVisible (true);
        theHero = new Hero();
    }
    int[][] Board = {
            { 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 },
            { 0, 0, 0, 1, 0, 1, 0, 1, 1, 0 },
            { 0, 1, 1, 1, 0, 1, 0, 1, 1, 0 },
            { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
            { 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 },
            { 0, 1, 0, 1, 0, 0, 0, 0, 1, 0 },
            { 0, 1, 0, 1, 0, 1, 1, 0, 1, 0 },
            { 0, 0, 0, 0, 0, 1, 1, 0, 1, 0 },
            { 0, 1, 1, 1, 0, 0, 0, 0, 1, 0 },
            { 0, 0, 0, 1, 0, 1, 1, 0, 1, 0 },
            { 0, 1, 0, 1, 0, 1, 0, 0, 0, 0 },
    } ;

    @Override
    public void paint(Graphics graphics) {
        super.paint (graphics);
//        graphics.fillRect (testBoxX, testBoxY, 100, 100);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        PositionedImage image = new PositionedImage ("Assets/floor.png", 300, 300);
        image.draw (graphics);


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                PositionedImage imageFloor = new PositionedImage ("Assets/floor.png", 72 * i, 72 * j);
                PositionedImage imageWall = new PositionedImage ("Assets/wall.png", 72 * i, 72 * j);

                if (Board [i] [j] == 0) {
                    imageFloor.draw (graphics);
                } else if (Board [i][j] == 1) {
                    imageWall.draw (graphics);
                }
            }
        }theHero.draw(graphics);
    }

    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame ("RPG Game");
        Board board = new Board ( );
        frame.add (board);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
        frame.pack ( );
        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener (board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode ( ) == KeyEvent.VK_UP) {
            theHero.posY -= 100;
        } else if (e.getKeyCode ( ) == KeyEvent.VK_DOWN) {
            theHero.posY += 100;
        } else if (e.getKeyCode ( ) == KeyEvent.VK_RIGHT) {
            theHero.posX += 100;
        } else if (e.getKeyCode ( ) == KeyEvent.VK_LEFT) {
            theHero.posX += -100;}
            // and redraw to have a new picture with the new coordinates
            repaint ( );
        }
    }

