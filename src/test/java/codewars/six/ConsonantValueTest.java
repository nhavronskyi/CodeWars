package codewars.six;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ConsonantValueTest {
    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void basicTests(String word, int exp) {
        Assertions.assertEquals(exp, ConsonantValue.solve(word));
    }

    @Test
    void Test() {
        Assertions.assertEquals(26, ConsonantValue.solve("z"));
        Assertions.assertEquals(2, ConsonantValue.solve("b"));
    }

    Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.arguments("zodiac", 26),
                Arguments.arguments("chruschtschov", 80),
                Arguments.arguments("khrushchev", 38),
                Arguments.arguments("strength", 57),
                Arguments.arguments("catchphrase", 73),
                Arguments.arguments("twelfthstreet", 103),
                Arguments.arguments("mischtschenkoana", 80)
        );
    }
}