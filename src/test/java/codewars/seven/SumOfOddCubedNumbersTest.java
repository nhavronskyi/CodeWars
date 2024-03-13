package codewars.seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfOddCubedNumbersTest {
    @Test
    public void testSomething() {
        assertEquals(0, SumOfOddCubedNumbers.cubeOdd(new int[]{-5, -5, 5, 5}));
        assertEquals(28, SumOfOddCubedNumbers.cubeOdd(new int[]{1, 2, 3, 4}));
        assertEquals(0, SumOfOddCubedNumbers.cubeOdd(new int[]{-3, -2, 2, 3}));

    }
}