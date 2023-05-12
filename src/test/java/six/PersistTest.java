package six;

import codewars.six.Persist;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersistTest {

    @Test
    public void basicTests() {
        assertEquals(3, Persist.persistence(39), "Incorrect answer for n=39");
        assertEquals(0, Persist.persistence(4), "Incorrect answer for n=4");
        assertEquals(2, Persist.persistence(25), "Incorrect answer for n=25");
        assertEquals(4, Persist.persistence(999), "Incorrect answer for n=999");
    }
}
