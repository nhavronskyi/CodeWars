package codewars.five;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScrambliesTest {
    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    @Order(1)
    public void sampleTests() {
        testing(Scrambles.scramble("rkqodlw", "world"), true);
        testing(Scrambles.scramble("cedewaraaossoqqyt", "codewars"), true);
        testing(Scrambles.scramble("katas", "steak"), false);
        testing(Scrambles.scramble("scriptjavx", "javascript"), false);
        testing(Scrambles.scramble("scriptingjava", "javascript"), true);
        testing(Scrambles.scramble("scriptsjava", "javascripts"), true);
        testing(Scrambles.scramble("javscripts", "javascript"), false);
        testing(Scrambles.scramble("aabbcamaomsccdd", "commas"), true);
        testing(Scrambles.scramble("commas", "commas"), true);
        testing(Scrambles.scramble("sammoc", "commas"), true);
    }

    @Test
    @Order(2)
    public void largeTest() {

        String s1 = "abcdefghijklmnopqrstuvwxyz".repeat(10_000);
        String s2 = "zyxcba".repeat(9_000);

        testing(Scrambles.scramble(s1, s2), true);
    }
}
