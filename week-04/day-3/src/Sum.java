import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
    List<Integer> myArrayList = new ArrayList<>(Arrays.asList(4, 6, 8, 10));

    public int elementsSum(){
        if(myArrayList == null){
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < myArrayList.size(); i++){
            sum = sum + myArrayList.get (i);
        }
        return sum;
    }
}
