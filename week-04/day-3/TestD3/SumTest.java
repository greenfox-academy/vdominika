import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {


    @Before
    public void setUp() throws Exception {
        System.out.println ("whether the result will be true?" );

    }

    @After
    public void tearDown() throws Exception {
        System.out.println ("finally, it is over");
    }

    @Test
    public void getSum() throws Exception {
        Sum testSum = new Sum();
        testSum.myArrayList = new ArrayList<> (Arrays.asList (3, 6, 9 ));
        assertEquals(18, testSum.elementsSum());
    }
    @Test
    public void emptySum() throws Exception {
        Sum testSum = new Sum();
        testSum.myArrayList = new ArrayList<> (Arrays.asList());
        assertEquals(0, testSum.elementsSum());
    }

    @Test
    public void nullSum() throws Exception {
        Sum testSum = new Sum();
        testSum.myArrayList = null;
        assertEquals(0, testSum.elementsSum());
    }
}