import java.util.List;

public class FunctionDojo {
    List<Integer> dojoList;
    int lookupValue;

    public int functionDojo(int lookupValue, List<Integer> dojoList) {
        for (int i = 0; i < dojoList.size ( ); i++) {
            if (lookupValue == dojoList.get (i)) {
                return i;
            }
        }
        return -1;
    }
}
