
import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        int [] a = new int[2];
        System.out.println ("Please give me two numbers \n" );
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt ();
        }
        if (a[0] > a[1]){
            System.out.println ("The bigger number is "+ a[0] );
        }else if (a[0] == a[1]){
            System.out.println ("The two numbers are equal" );
        }else{
            System.out.println ("The bigger number is "+ a[1] );
        }
    }
}
