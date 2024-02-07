package eight;

import codewars.eight.IsHeGonnaSurvive;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsHeGonnaSurviveTest {
    private static Stream<Arguments> trueHeroArgs() {
        return Stream.of(
                Arguments.arguments(10, 5),
                Arguments.arguments(100, 40)
        );
    }

    private static Stream<Arguments> falseHeroArgs() {
        return Stream.of(
                Arguments.arguments(4, 5),
                Arguments.arguments(1500, 751),
                Arguments.arguments(0, 1),
                Arguments.arguments(7, 4),
                Arguments.arguments(1_394_934_304, 1_250_784_759)
        );
    }

    @ParameterizedTest
    @DisplayName("A true hero")
    @MethodSource("trueHeroArgs")
    void aTrueHero(int bullets, int dragons) {
        assertTrue(IsHeGonnaSurvive.hero(10, 5),
                "With " + bullets + " bullets and " + dragons + " dragons");
    }

    @ParameterizedTest
    @DisplayName("A false hero")
    @MethodSource("falseHeroArgs")
    void aFalseHero(int bullets, int dragons) {
        assertFalse(IsHeGonnaSurvive.hero(bullets, dragons),
                "with " + bullets + " bullets and " + dragons + " dragons");
    }
}