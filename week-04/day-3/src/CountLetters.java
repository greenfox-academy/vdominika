import com.sun.xml.internal.fastinfoset.util.CharArray;

import static java.lang.Character.SIZE;
import java.util.Arrays;
import java.util.HashMap;


public class CountLetters {
    String szavak = "Az ember mindig tobbre vagyik, de ha nem vagyna akkor is tobbet csinalna";


    public static void main(String[] args) {
//        CountLetters countLetters = new CountLetters();
        System.out.println (counting("Az ember mindig tobbre vagyik, de ha nem vagyna akkor is tobbet csinalna") );
    }
    public static HashMap<Character, Integer> counting(String szolanc) {
        char[] karakter = szolanc.toCharArray ( );
        HashMap<Character, Integer> myHashMap = new HashMap<> ( );
        for (int i = 0; i < karakter.length; i++) {
            if (myHashMap.containsKey (karakter[i])) {
                myHashMap.replace (karakter[i], myHashMap.get(karakter[i]) + 1);
            } else {
                myHashMap.put (karakter[i], 1);
            }
        }return myHashMap;
    }
}
