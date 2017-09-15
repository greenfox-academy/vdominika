import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt();

        int myNumber = 44;

        if (n > 44) {
            System.out.println("That is too much, please try again!");
        }
        if (n < 44) {
            System.out.println("That is too low, please try again!");
        }
        if (n==44){
            System.out.println("That's correct!");
        }
    }
}

