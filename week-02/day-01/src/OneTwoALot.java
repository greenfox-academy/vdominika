import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.println ("Please give a number");
        int userNumber = myScanner.nextInt ( );
        if (userNumber <= 0) {
            System.out.println ("not enough");
        } else if (userNumber == 1) {
            System.out.println ("one");
        } else if (userNumber == 2) {
            System.out.println ("two");
        } else {
            System.out.println ("a lot");
        }
    }
}
