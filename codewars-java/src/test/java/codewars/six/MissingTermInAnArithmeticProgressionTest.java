package codewars.six;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MissingTermInAnArithmeticProgressionTest {
    @ParameterizedTest
    @MethodSource("args")
    void testIncreasing_1(int exp, int... act) {
        Assertions.assertEquals(exp, MissingTermInAnArithmeticProgression.findMissing(act));
    }

    Stream<Arguments> args() {
        return Stream.of(
                Arguments.arguments(3, new int[]{1, 2, 4}),
                Arguments.arguments(2, new int[]{1, 3, 4}),
                Arguments.arguments(3, new int[]{4, 2, 1}),
                Arguments.arguments(2, new int[]{4, 3, 1}),
                Arguments.arguments(1, new int[]{1, 1, 1})
        );
    }

}