package codewars.seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SquareTest {
    @Test
    public void shouldWorkForSomeExamples() {
        assertFalse(YoureASquare.Square.isSquare(-1), "negative numbers aren't square numbers");
        assertTrue(YoureASquare.Square.isSquare(0), "0 is a square number (0 * 0)");
        assertFalse(YoureASquare.Square.isSquare(3), "3 isn't a square number");
        assertTrue(YoureASquare.Square.isSquare(4), "4 is a square number (2 * 2)");
        assertTrue(YoureASquare.Square.isSquare(25), "25 is a square number (5 * 5)");
        assertFalse(YoureASquare.Square.isSquare(26), "26 isn't a square number");
    }
}
