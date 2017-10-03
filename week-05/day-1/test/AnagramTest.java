import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram testAnagram = new Anagram ();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void anagramTest1() throws Exception{
        assertTrue (testAnagram.anagramChecker("sssa","asss"));
    }
}