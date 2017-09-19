import java.util.Scanner;

public class CountFromTo {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int a = scanner.nextInt();

        System.out.println("Please enter another number");
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("The first number should be bigger");}

        else {
            for( b; b > a; b--);
            }
        }
    }

