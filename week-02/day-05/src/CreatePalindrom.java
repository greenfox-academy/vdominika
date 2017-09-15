import java.util.Scanner;

public class CreatePalindrom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me a word:");
        String userInput1 = scanner.nextLine();

        String word = userInput1;
        String reversedWord="";

        for(int i=word.length()-1;i>=0;i--){
            reversedWord = reversedWord + word.charAt(i);
        }

        System.out.println(userInput1+reversedWord);
    }

}


