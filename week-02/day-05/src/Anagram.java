import java.util.Scanner;
import java.io.*;

public class Anagram {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me a word:");
        String userInput1 = scanner.nextLine();
        System.out.println("Please give me another one:");
        String userInput2 = scanner.nextLine();

        String Str1 = new String (userInput1);
        String Str2 = new String(userInput2 );

//        System.out.print("String Length :" );
//        System.out.println(Str1.length());
//
//        System.out.print("String Length :" );
//        System.out.println(Str2.length());
//
       if (Str1.length() == Str2.length()){
            System.out.println("These are same long words!");
//    }
//        else if (){

        }
}}
