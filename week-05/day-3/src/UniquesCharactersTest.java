import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UniquesCharactersTest {

    ArrayList<String> example;
    ArrayList<String> empty;

    @Before
    public void setUp() throws Exception {
        example = new ArrayList<> (Arrays.asList ("k", "m", "n", "c"));
        empty = new ArrayList<> ();
    }

    @Test
    public void uniqueCharacters() throws Exception {
        assertEquals(example, UniquesCharacters.uniqueCharacters ("kemence"));
    }
    @Test
    public void uniqueCharactersTestEmptyString() throws Exception {
        assertEquals (empty, UniquesCharacters.uniqueCharacters (""));
    }
    @Test
    public void uniqueCharactersTestOnlyNotUnique() throws Exception {
        assertEquals (empty, UniquesCharacters.uniqueCharacters ("aaaaaaa"));
    }
}