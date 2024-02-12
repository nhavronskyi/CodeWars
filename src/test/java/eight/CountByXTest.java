package eight;

import codewars.eight.CountByX;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CountByXTest {
    @ParameterizedTest
    @MethodSource(value = "arguments")
    public void fixedTests(int[] expected, int x, int n) {
        assertArrayEquals(expected, CountByX.countBy(x, n));
    }

    public Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.arguments(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1, 10),
                Arguments.arguments(new int[]{2, 4, 6, 8, 10}, 2, 5),
                Arguments.arguments(new int[]{3, 6, 9, 12, 15, 18, 21}, 3, 7),
                Arguments.arguments(new int[]{50, 100, 150, 200, 250}, 50, 5),
                Arguments.arguments(new int[]{100, 200, 300, 400, 500, 600}, 100, 6));
    }
}
