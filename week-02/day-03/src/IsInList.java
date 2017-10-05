import java.util.*;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        boolean contains = list.contains(4) && list.contains(8) && list.contains(12) && list.contains(16);

        if (contains){
            System.out.println ("True" );
        }else{
            System.out.println ("False" );
        }
    }
}