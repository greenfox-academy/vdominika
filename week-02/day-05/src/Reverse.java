/*// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

public class Reverse {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};

        int swap = aj[4];
        int swap2 = aj[3];
        aj[4] = aj[0];
        aj[3] = aj[1];
        aj[1] = swap2;
        aj[0] = swap;

        System.out.println (aj[i]);
    }
}*/
public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`

        int[] aj = {3, 4, 5, 6, 7};

        for (int i = 0; i < 2; i++) {
            int swapper = aj[i];
            aj[i] = aj[4 - i];
            aj[4 - i] = swapper;
        }

        for (int j = 0; j <= aj.length -1; j++) {
            System.out.print(aj[j] + ", ");
        }
    }
}