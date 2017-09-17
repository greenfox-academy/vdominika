import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many chickens do you have?");
        int chicken = scanner.nextInt();

        System.out.println("And how many pigs do you have?");
        int pigs = scanner.nextInt();

        System.out.println("The number of the animal legs are: " + (chicken * 2 + pigs * 4));

        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The seconf represents the number of pigs the farmer has
        // It should print how many legs all the animals have
    }
}