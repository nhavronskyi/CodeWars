package codewars.seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfCubesTest {
    @Test
    public void exampleTests() {
        assertEquals(1, SumOfCubes.sumCubes(1));
        assertEquals(9, SumOfCubes.sumCubes(2));
        assertEquals(36, SumOfCubes.sumCubes(3));
        assertEquals(100, SumOfCubes.sumCubes(4));
        assertEquals(3025, SumOfCubes.sumCubes(10));
        assertEquals(58155876, SumOfCubes.sumCubes(123));
    }
}