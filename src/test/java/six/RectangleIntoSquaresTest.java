package six;

import codewars.six.RectangleIntoSquares;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RectangleIntoSquaresTest {

    @Test
    public void test1() {
        assertEquals(Arrays.asList(3, 2, 1, 1), RectangleIntoSquares.sqInRect(5, 3));
    }

    @Test
    public void test2() {
        assertNull(RectangleIntoSquares.sqInRect(5, 5));
    }
}
