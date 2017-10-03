import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberConverterTest {
    NumberConverter testConverter = new NumberConverter ();


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void converterTest1() {
        assertEquals ("five", testConverter.numberToWord(5));
    }
    @Test
    public void converterTest2() {
        assertEquals ("six", testConverter.numberToWord (6));

    }
}