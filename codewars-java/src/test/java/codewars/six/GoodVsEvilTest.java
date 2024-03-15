package codewars.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoodVsEvilTest {
    @Test
    public void testEvilWin() {
        assertEquals(GoodVsEvil.BattleResults.EVIL.getResult(),
                GoodVsEvil.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"), "Evil should win");
    }

    @Test
    public void testGoodWin() {
        assertEquals(GoodVsEvil.BattleResults.GOOD.getResult(),
                GoodVsEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"), "Good should win");
    }

    @Test
    public void testTie() {
        assertEquals(GoodVsEvil.BattleResults.TIE.getResult(),
                GoodVsEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"), "Should be a tie");
    }
}