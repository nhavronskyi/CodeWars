package six;

import codewars.six.DuplicateEncoder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DuplicateEncoderTest {
    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
    }
}