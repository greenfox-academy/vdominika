import java.util.ArrayList;
import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {


        Tree tolgy = new Tree();
        tolgy.type = "tolgy";
        tolgy.leafcolor = "green";
        tolgy.age = 12;
        tolgy.sex = "male";
//        tolgy.speak ();

        Tree bukk = new Tree ("bukk", "brown", 34, "female");
//        bukk.speak ();

        ArrayList<Tree> forest = new ArrayList<> (Arrays.asList (tolgy, bukk));
        for (int i = 0; i < forest.size () ; i++) {
            forest.get (i).speak ();
        }

    }

}
