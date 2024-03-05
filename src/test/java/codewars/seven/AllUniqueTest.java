package codewars.seven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AllUniqueTest {
    @ParameterizedTest
    @ValueSource(strings = {"abcde", "AaBbc"})
    public void trueTests(String str) {
        assertTrue(AllUnique.hasUniqueChars(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"  nAa", "++-"})
    public void falseTests(String str) {
        assertFalse(AllUnique.hasUniqueChars(str));
    }
}