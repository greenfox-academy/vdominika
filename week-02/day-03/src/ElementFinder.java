import java.util.*;

public class ElementFinder {
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

        if (arrayList.contains (7)){
            System.out.println ("Hoorray" );
        }else{
            System.out.println ("Nooooo" );
        }
    }
}

// OR
//    public static void version2.0 (String... args) {
//        ArrayList<Integer> arrayList = new ArrayList<Integer> (Arrays.asList (1, 2, 3, 4, 5));
//
//        for (int i = 0; i < arrayList.size ( ); i++) {
//            if (arrayList.get (i) == 7) {
//                System.out.println ("Hoorray");
//            } else {
//                System.out.println ("Noooo");
//            }break;
//
//             Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
//             Do this again with a different solution using different list functions!
//
//        }
//    }
