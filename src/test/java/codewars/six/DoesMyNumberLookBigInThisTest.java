package codewars.six;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DoesMyNumberLookBigInThisTest {
    @ParameterizedTest
    @ValueSource(ints = {153, 1634})
    void trueTest(int num) {
        Assertions.assertTrue(DoesMyNumberLookBigInThis.isNarcissistic(num));
    }

    @Test
    void falseTest() {
        Assertions.assertFalse(DoesMyNumberLookBigInThis.isNarcissistic(112));
    }
}
