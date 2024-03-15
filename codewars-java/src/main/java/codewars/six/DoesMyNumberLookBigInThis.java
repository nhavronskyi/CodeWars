package codewars.six;

import java.util.Arrays;

public class DoesMyNumberLookBigInThis {
    public static boolean isNarcissistic(int number) {
        var txtNum = String.valueOf(number);
        var sum = Arrays.stream(txtNum.split(""))
                .mapToInt(Integer::parseInt)
                .map(x -> (int) Math.pow(x, txtNum.length()))
                .sum();

        return sum == number;
    }
}
