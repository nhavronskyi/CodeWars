package eight;

import codewars.eight.DNAToRNAConversion;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DNAToRNAConversionTest {
    @ParameterizedTest
    @MethodSource("arguments")
    public void testDna(String expected, String actual) {
        assertEquals(expected, DNAToRNAConversion.dnaToRna(actual));
    }

    private Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.arguments("UUUU", "TTTT"),
                Arguments.arguments("GCAU", "GCAT")
        );
    }
}
