import java.util.Scanner;

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        int number = 13;
        System.out.println ("Please guess a number!");
        int input = myScanner.nextInt ( );

        while (true) {
            if (input > number) {
                System.out.println ("Lower!");
                input =myScanner.nextInt ();
                return;
            } else if (input < number) {
                System.out.println ("Higher!");
                input =myScanner.nextInt ();
                return;
            } else {
                System.out.println ("You won!");
                break;
            }
        }
    }
}
