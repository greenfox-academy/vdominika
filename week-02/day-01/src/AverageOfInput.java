import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println ("Please enter a number" );
        double a = myScanner.nextInt ();

        System.out.println ("Please enter a number" );
        double b = myScanner.nextInt ();

        System.out.println ("Please enter a number" );
        double c = myScanner.nextInt ();

        System.out.println ("Please enter a number" );
        double d = myScanner.nextInt ();

        System.out.println ("Please enter a number" );
        double e = myScanner.nextInt ();

        double sum = a + b + c + d + e;
        double average = sum / 5;

        System.out.println ("Sum is "+ sum );
        System.out.println ("Average is "+ average );}
    }

