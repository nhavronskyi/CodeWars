package codewars.six;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodVsEvilTest {
    @Test
    public void testEvilWin() {
        assertEquals("Evil should win", GoodVsEvil.BattleResults.EVIL.getResult(),
                GoodVsEvil.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
    }

    @Test
    public void testGoodWin() {
        assertEquals("Good should win", GoodVsEvil.BattleResults.GOOD.getResult(),
                GoodVsEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
    }

    @Test
    public void testTie() {
        assertEquals("Should be a tie", GoodVsEvil.BattleResults.TIE.getResult(),
                GoodVsEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
    }
}