import java.util.ArrayList;

public class Printer2 {


    public static ArrayList<Character> creatingArrayList (String s) {

        ArrayList<Character> sample = new ArrayList<Character>();
        for(int i = 0; i< s.length (); i++){
            sample.add(s.charAt(i));
        }
        return sample;
    }

    public static void characterSearcher (String abcvege, ArrayList<Character> sample){

        if (abcvege.contains(sample.ch))
    }

    public static void main(String[] args) {

        String s = "moidisiuyriuaiuylidsuliauyewiau";
        int x = s.length();
        final String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String abcvege = alphabet.substring(13);

        String[] res = new String[abcvege.length()];
        for (int j = 0; j < abcvege.length(); j++) {
            res[j] = Character.toString(abcvege.charAt(j));
        }

        System.out.println(abcvege);
        System.out.println(creatingArrayList(s));
    }
}
