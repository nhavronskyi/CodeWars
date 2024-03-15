package codewars.five;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RGBToHexConversionTest {
    @ParameterizedTest
    @MethodSource(value = "arguments")
    void sampleTests(String expected, RGB rgb) {
        assertEquals(expected, RGBToHexConversion.rgb(rgb.r, rgb.g, rgb.b));
    }

    private Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.arguments("000000", new RGB(0, 0, 0)),
                Arguments.arguments("010203", new RGB(1, 2, 3)),
                Arguments.arguments("FFFFFF", new RGB(255, 255, 255)),
                Arguments.arguments("FEFDFC", new RGB(254, 253, 252)),
                Arguments.arguments("00FF7D", new RGB(-20, 275, 125))
        );
    }

    private record RGB(int r, int g, int b) {
    }
}
