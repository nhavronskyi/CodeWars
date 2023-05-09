package six;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import codewars.six.DuplicateEncoder;


public class DuplicateEncoderTest {
    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}