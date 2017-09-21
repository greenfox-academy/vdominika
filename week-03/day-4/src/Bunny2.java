// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
public class Bunny2 {
    public static void main(String[] args) {
        System.out.println ( bunny2 (6));
    }

    public static int bunny2(int n) {
        if (n == 2) {
            return 5;
        } else if (n%2 == 0){
            return bunny2 (n-1)+3;
        } else
            return bunny2 (n-1)+2;

    }
}
