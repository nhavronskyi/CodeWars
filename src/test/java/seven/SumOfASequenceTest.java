package seven;

import codewars.seven.SumOfASequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SumOfASequenceTest {
    @ParameterizedTest
    @MethodSource("arguments")
    void testSomething(int res, int start, int end, int step) {
        Assertions.assertEquals(res, SumOfASequence.sequenceSum(start, end, step));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.arguments(12, 2, 6, 2),
                Arguments.arguments(15, 1, 5, 1),
                Arguments.arguments(5, 1, 5, 3),
                Arguments.arguments(45, 0, 15, 3),
                Arguments.arguments(0, 16, 15, 3)
        );
    }
}
