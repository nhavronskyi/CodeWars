package five;

import codewars.five.GreedIsGood;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class GreedIsGoodTest {
    private static Stream<Arguments> stream() {
        return Stream.of(
                Arguments.arguments(250, new int[]{5, 1, 3, 4, 1}),
                Arguments.arguments(1100, new int[]{1, 1, 1, 3, 1}),
                Arguments.arguments(450, new int[]{2, 4, 4, 5, 4}),
                Arguments.arguments(2000, new int[]{1, 1, 1, 1, 1, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("stream")
    public void testExample(int expected, int[] dice) {
        Assertions.assertEquals(expected, GreedIsGood.greedy(dice));
    }
}
