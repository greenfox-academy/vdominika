import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me a number: ");
        int userInput = scanner.nextInt();

        if (userInput <= 0){
        System.out.println("It is not enough");
    }

        else if (userInput == 1) {
            System.out.println("one");
        }

        else if (userInput == 2) {
            System.out.println("two");
        }

        else  {
            System.out.println("It's a lot!");
        }
    }
}
