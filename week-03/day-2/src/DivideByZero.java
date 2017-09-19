import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please give a number");
        double divider = scanner.nextDouble();

        try{
            double result = divider / 10;
            System.out.println(result);}
        catch(ArithmeticException e){
            System.out.println("fail");
        }


    }
    }


// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0