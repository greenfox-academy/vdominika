import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        int a[] = new int[2];
        System.out.println ("Please tell me how many girls and how many boys are in the party: \n");
        Scanner input = new Scanner (System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt ( );
        }

        if (a[0] + a[1] > 20 && a[0] == a[1]) {
            System.out.println ("This party is excellent!");
        } else if (a[0] + a[1] < 20) {
            System.out.println ("Average party...");
        } else if (a[0] == 0) {
            System.out.println ("Sausage party");
        } else if (a[0] + a[1] > 20 && a[0] != a[1]) {
            System.out.println ("Quite cool");
        }
    }
}
