import java.util.Scanner;

// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
public class Triangle {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.println ("Please give me a number");
        int input = myScanner.nextInt ( );

        for (int i = 1; i < input; i++) {
            for (int j = 0; j < i; j++) {
                if
                System.out.print ("*");
            }
            System.out.println ( );
        }
    }
}
