import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Domino implements Comparable<Domino> {
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    public static void main(String[] args) {

        List<Domino> dominoes = new ArrayList<> ( );
        dominoes.add (new Domino (5, 2));
        dominoes.add (new Domino (4, 6));
        dominoes.add (new Domino (1, 5));
        dominoes.add (new Domino (6, 7));
        dominoes.add (new Domino (2, 4));
        dominoes.add (new Domino (7, 1));

// Java version
        Collections.sort (dominoes);
        for (Domino d : dominoes) {
            System.out.println (d);
        }
    }

    public int compareTo(Domino compareValue) {

        if (this.getValues ( )[0] == compareValue.getValues ( )[0] && this.getValues ( )[1] < compareValue.getValues ( )[1]) {
            return -1;
        } else if (this.getValues ( )[0] > compareValue.getValues ( )[0]) {
            return -1;
        } else {
            return 1;
        }
    }
}