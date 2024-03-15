package codewars.seven;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MinimizeSumOfArrayTest {
    @ParameterizedTest
    @MethodSource("argumentsStream")
    @DisplayName("basic tests")
    public void basicTests(int expected, int[] arr) {
        assertEquals(expected, MinimizeSumOfArray.minSum(arr));
    }

    Stream<Arguments> argumentsStream() {
        return Stream.of(
                arguments(22, new int[]{5, 4, 2, 3}),
                arguments(342, new int[]{12, 6, 10, 26, 3, 24}),
                arguments(74, new int[]{9, 2, 8, 7, 5, 4, 0, 6})
        );
    }
}