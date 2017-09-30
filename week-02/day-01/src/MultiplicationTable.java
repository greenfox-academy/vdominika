import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner (System.in);
        System.out.println ("Please enter a number");
        int a = myScanner.nextInt ();

        for (int i = 0; i <11 ; i++) {
            System.out.println (i +" * "+ a +" = " +i * a );
        }
    }
}
