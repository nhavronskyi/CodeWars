package codewars.seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PowerOfTwoTest {
    @Test
    void testPowerOfTwo() {
        assertTrue(PowerOfTwo.isPowerOfTwo(2));
        assertTrue(PowerOfTwo.isPowerOfTwo(4096));
    }

    @Test
    void testNotPowersOfTwo() {
        assertFalse(PowerOfTwo.isPowerOfTwo(333));
        assertFalse(PowerOfTwo.isPowerOfTwo(0));
    }
}