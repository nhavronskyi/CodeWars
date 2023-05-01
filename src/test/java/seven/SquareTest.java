package seven;

import codewars.seven.YoureASquare;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SquareTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertFalse("negative numbers aren't square numbers", YoureASquare.Square.isSquare(-1));
        assertTrue("0 is a square number (0 * 0)", YoureASquare.Square.isSquare(0));
        assertFalse("3 isn't a square number", YoureASquare.Square.isSquare(3));
        assertTrue("4 is a square number (2 * 2)", YoureASquare.Square.isSquare(4));
        assertTrue("25 is a square number (5 * 5)", YoureASquare.Square.isSquare(25));
        assertFalse("26 isn't a square number", YoureASquare.Square.isSquare(26));
    }
}
