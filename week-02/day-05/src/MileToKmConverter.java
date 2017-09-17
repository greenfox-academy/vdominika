import java.util.Scanner;

public class MileToKmConverter {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me the distance in kilometers:");
        int userInput = scanner.nextInt();
        double mile = userInput * 0.621371;

        System.out.println("This is miles: " + mile);
    }
}
