package codewars.eight;

import java.util.stream.IntStream;

public class CountByX {
    public static int[] countBy(int x, int n) {
        return IntStream.range(1, n + 1)
                .map(num -> num * x)
                .toArray();
    }
}
