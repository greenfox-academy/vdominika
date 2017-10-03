import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class functionDojoTest {

        FunctionDojo testDojo = new FunctionDojo ();
    List<Integer> atestdojo = new ArrayList<>();

    @Before
            public void setUp() throws Exception {
        atestdojo.add (3);
        atestdojo.add (6);
        atestdojo.add (9);
    }

    @Test

    public void functionDojo1() throws Exception {
        assertEquals (-1, testDojo.functionDojo(4,atestdojo));
    }

    @Test
    public void functionDojo2() throws Exception {
    assertTrue (testDojo.dojoList.size() >= 0);
    }

    @Test

    public void functionDojo3() throws Exception {
        assertEquals (0, testDojo.functionDojo(3,atestdojo));
    }


}