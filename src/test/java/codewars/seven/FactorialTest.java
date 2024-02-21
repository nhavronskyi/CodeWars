package codewars.seven;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FactorialTest {
    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void testSomething(long exp, int act) {
        assertEquals(exp, Factorial.factorial(act));
    }

    Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.arguments(1, 0),
                Arguments.arguments(1, 1),
                Arguments.arguments(24, 4),
                Arguments.arguments(5040, 7)
        );

    }
}