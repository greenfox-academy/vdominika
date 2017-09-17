
import java.io.IOException;
import java.util.Scanner;

    public class GuessingGame {

        public static int random = (int) (Math.random() * 100 + 1);
        public static int data;
        public static int go;
        public static int attempt = 10;

        public static void Start() throws IOException {

            Scanner scanInput = new Scanner(System.in);
            data = scanInput.nextInt();

            if (data > 100) {
                System.out.println("Only Enter Numbers Between 0-100");
                Start();
            } else if (data == random) {
                System.out.println("Wow, you guessed it!!");
                scanInput.close();
                System.exit(0);
            } else if (data < random) {
                go += 1;
                if (go == attempt) {
                    System.out.println("You have guessed the wrong number " + go + " times, sorry but you'll have to try again! :(");
                    scanInput.close();
                    System.exit(0);
                }
                System.out.println("Higher");
                Start();
            } else if (data > random) {
                go += 1;
                if (go == attempt) {
                    System.out.println("You have guessed the wrong number " + go + " times, sorry but you'll have to try again! :(");
                    scanInput.close();
                    System.exit(0);
                }
                System.out.println("Lower");
                Start();
            }
        }

        public static void main(String[] args) throws IOException {
            System.out.println("Guess A Number Between 0-100 Within " + attempt + " Goes");
            Start();
        }

    }



