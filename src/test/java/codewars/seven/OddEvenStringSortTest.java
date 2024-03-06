package codewars.seven;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OddEvenStringSortTest {
    @ParameterizedTest
    @MethodSource("args")
    public void testSomething(String exp, String act) {
        assertEquals(exp, OddEvenStringSort.sortMyString(act));
    }

    Stream<Arguments> args() {
        return Stream.of(
                Arguments.arguments("Wleclgltihuebredrf ofsheesenasnegrof", "Wolfeschlegelsteinhausenbergerdorff"),
                Arguments.arguments("MTINLHENLHENGUAIYAGNL EHOYTROYTROYLTMNLRIY", "METHIONYLTHREONYLTHREONYGLUTAMINYLARGINYL"),
                Arguments.arguments("PEMNUTAIRSOISLCVLAOOISS NUOOLRMCOCPCIIOOCNCNOI", "PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS"),
                Arguments.arguments("PEDPEDHPPRTYODS SUOSUOYOAAHRIIM", "PSEUDOPSEUDOHYPOPARATHYROIDISM"),
                Arguments.arguments("FOCNUIIIIIIIAIN LCIACNHLPLFCTO", "FLOCCINAUCINIHILIPILIFICATION"),
                Arguments.arguments("SBEMTGYHC UDRAOLPI", "SUBDERMATOGLYPHIC")
        );
    }
}