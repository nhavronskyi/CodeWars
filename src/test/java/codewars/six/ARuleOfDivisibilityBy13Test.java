package codewars.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ARuleOfDivisibilityBy13Test {
    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void tests() {
        testing(ARuleOfDivisibilityBy13.thirt(8529), 79);
        testing(ARuleOfDivisibilityBy13.thirt(85299258), 31);
        testing(ARuleOfDivisibilityBy13.thirt(5634), 57);
        testing(ARuleOfDivisibilityBy13.thirt(1111111111), 71);
        testing(ARuleOfDivisibilityBy13.thirt(987654321), 30);
    }
}