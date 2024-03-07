package codewars.seven;

import java.util.Arrays;

public class SumOfOddCubedNumbers {
    public static int cubeOdd(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .filter(x -> x % 2 != 0)
                .mapToInt(x -> (int) Math.pow(x, 3))
                .sum();
    }
}
