import java.util.Arrays;

public class Anagram {

    public  boolean anagramChecker(String str1, String str2) {

        char[] firstWord = str1.toCharArray ();
        char[] secondWord = str2.toCharArray ();

        Arrays.sort (firstWord);
        Arrays.sort (secondWord);

        return Arrays.equals (firstWord, secondWord);
    }
}