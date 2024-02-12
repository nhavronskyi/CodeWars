package codewars.seven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SwitcherooTest {
    @Test
    public void testSomething() {
        assertEquals("abc", Switcheroo.switcheroo("bac"));
        assertEquals("ccc", Switcheroo.switcheroo("ccc"));
        assertEquals("aaabcccbaaa", Switcheroo.switcheroo("bbbacccabbb"));
    }
}
