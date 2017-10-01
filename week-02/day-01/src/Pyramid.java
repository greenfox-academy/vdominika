// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println ("Please enter a number" );
        int input = myScanner.nextInt ();

        for (int i = 1; i <= input; i+=2) {
            for (int j = 0; j < i; j++) {
                System.out.print ("*" );
            }
            System.out.println (" " );
        }
    }
}
