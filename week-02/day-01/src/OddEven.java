import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println ("Please give me a number" );
        int userNumber = myScanner.nextInt ( );
         if (userNumber % 2 ==0){
             System.out.println ("It is even!" );
         }else{
             System.out.println ("It is odd!" );
         }
    }
}
