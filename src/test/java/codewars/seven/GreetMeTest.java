package codewars.seven;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetMeTest {
    @Test
    public void basicTests() {
        assertEquals("Hello Riley!", GreetMe.greet("riley"));
    }
}