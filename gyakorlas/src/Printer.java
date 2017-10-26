/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//veszem az abc felet karakterekben
//karakterekke alakitom a bevitt szoveget
//vegig iteralom a szoveget es megnezem melyik karakter szerepel az abc masodik feleben
//kiirom a szamat, hogy hany karakter kerult a masodik felbe a hany karakterbol

public class Printer {
    //letrehozok egy fixalt abc Stringet
    final static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static void printerError(String s) {
        //megszamolom a String karaktereit:
        int x = s.length();
        //kisbetuve teszem a Stringet:
        s.toLowerCase();

        //vegigiteralom a Stringet, letrehozva egy szoveg nevu karakter array-t belole
        String [] szoveg = new String[s.length()];
            for (int i = 0; i < s.length(); i++) {
                szoveg[i] = Character.toString(s.charAt(i));
            }

        //a szoveg nevu karakter array-bol letrehozok egy szovegarrayList nevu karakter arrayListet
        List<Character> szovegArrayList = new ArrayList<Character>();
            for (char : szoveg){
                szovegArrayList.add(c);
            }
        }
        //vegigiteralom a szovegArrayList nevu karakter arrayListet kiszedve belole a karaktereket, amik nem tartoznak az abcvege karakter array-be


    public static void main(String[] args) {
        String abcvege = alphabet.substring(13);

        String[] res = new String[abcvege.length()];
            for (int j = 0; j < abcvege.length(); j++) {
                res[j] = Character.toString(abcvege.charAt(j));
            }
}
}*/