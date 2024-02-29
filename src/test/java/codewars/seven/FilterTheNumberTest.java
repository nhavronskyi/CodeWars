package codewars.seven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FilterTheNumberTest {
    @ParameterizedTest
    @MethodSource("args")
    public void exampleTests(int exp, String act) {
        Assertions.assertEquals(exp, FilterTheNumber.filterString(act));
    }

    Stream<Arguments> args() {
        return Stream.of(
                Arguments.arguments(123, "123"),
                Arguments.arguments(123, "a1b2c3"),
                Arguments.arguments(123, "aa1bb2cc3dd")
        );
    }
}