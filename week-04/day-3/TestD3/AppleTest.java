import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
    Apple newApple = new Apple ();
    String testMessage = "apple";

    @Test
    public void printMessage() {
        assertEquals("apple",newApple.printMessage());

    }
}