import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println ("Please enter a number" );
        int a = myScanner.nextInt ();

        System.out.println ("Please enter a number" );
        int b = myScanner.nextInt ();

        System.out.println ("Please enter a number" );
        int c = myScanner.nextInt ();

        System.out.println ("Please enter a number" );
        int d = myScanner.nextInt ();

        System.out.println ("Please enter a number" );
        int e = myScanner.nextInt ();

        int sum = a + b + c + d + e;
        double average = sum / 5;

        System.out.println ("Sum is "+ sum );
        System.out.println ("Average is "+ average );}
    }

