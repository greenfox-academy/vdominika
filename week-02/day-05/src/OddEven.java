import java.util.Scanner;

public class OddEven {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me a number:");
        int userInput = scanner.nextInt();

        if(userInput % 2 == 0){
            System.out.println("This number is even");
        }
        else
            System.out.println("This number is odd");
    }
}
