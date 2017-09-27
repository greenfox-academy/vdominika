import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void testAnag ()  {
        Anagram myAnagram = new Anagram ( );
        assertTrue (myAnagram.anagram ("sorok", "koros"));
    }
    @Test
    public void testNemAnag ()  {
        Anagram myAnagram = new Anagram ( );
        assertFalse (myAnagram.anagram ("soroz", "koros"));
    }
}