import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);

        System.out.println ("Please give me a number:");
        int startNumber = myScanner.nextInt ( );

        System.out.println ("Please give me another number:");
        int endNumber = myScanner.nextInt ( );

        if(endNumber < startNumber){
            System.out.println ("The second number should be bigger" );
        }else{
            for (int i = startNumber; i < endNumber ; i++) {
                System.out.println (i);
            }
        }
    }

}
