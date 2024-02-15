package codewars.six;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ReverseOrRotateTest {

    @ParameterizedTest
    @MethodSource("args")
    @DisplayName("ReverseOrRotate")
    public void test1(String str, int sz, String exp) {
        Assertions.assertEquals(exp, ReverseOrRotate.revRot(str, sz));
    }

    Stream<Arguments> args() {
        return Stream.of(
                Arguments.arguments("1234", 0, ""),
                Arguments.arguments("", 0, ""),
                Arguments.arguments("1234", 5, ""),
                Arguments.arguments("733049910872815764", 5, "330479108928157")
        );
    }
}