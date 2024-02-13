package codewars.six;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/52761ee4cffbc69732000738/train/java
public class GoodVsEvil {
    public static String battle(String goodAmounts, String evilAmounts) {
        var goodWorth = calculateAmountsWorth(parseToIntArr(goodAmounts), BattleResults.GOOD);
        var evilWorth = calculateAmountsWorth(parseToIntArr(evilAmounts), BattleResults.EVIL);


        if (goodWorth == evilWorth) {
            return BattleResults.TIE.getResult();
        }

        return goodWorth > evilWorth ? BattleResults.GOOD.getResult() : BattleResults.EVIL.getResult();
    }

    private static int[] parseToIntArr(String amount) {
        return Arrays.stream(amount.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static int calculateAmountsWorth(int[] amounts, BattleResults side) {
        return IntStream.range(0, amounts.length)
                .map(i -> amounts[i] * side.getWorthByRace(i))
                .sum();
    }

    @RequiredArgsConstructor
    @Getter
    public enum BattleResults {
        EVIL("Battle Result: Evil eradicates all trace of Good", new int[]{1, 2, 2, 2, 3, 5, 10}),
        GOOD("Battle Result: Good triumphs over Evil", new int[]{1, 2, 3, 3, 4, 10}),
        TIE("Battle Result: No victor on this battle field", null);

        private final String result;
        private final int[] worth;

        public int getWorthByRace(int race) {
            return worth[race];
        }
    }
}
