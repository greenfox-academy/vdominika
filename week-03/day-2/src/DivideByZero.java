import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number");

        }

        public static void Divider(double divider){

        double result = divider / 10;

        if (divider == 0){
                System.out.println("fail");}
        else{
                System.out.println(result);

        return;
        }


    }
    }


// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0