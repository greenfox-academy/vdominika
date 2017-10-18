// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

import java.util.Scanner;

public class DrawDiamond {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println ("Please give the diamond's size" );

        int input = myScanner.nextInt ();

        for (int i = 0; i < input/2; i++) {
            for (int j = i; j < input/2; j++) {
                System.out.println ("*");
            }
        }
        for (int i = input/2; i < input  ; i++) {
            for (int j = 0; j < input; j++) {
                System.out.println ("*" );
            }
        }
        System.out.println ("\n" );
    }
}
