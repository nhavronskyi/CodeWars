package codewars.six;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseOrRotate {
    public static String revRot(String str, int sz) {
        if (str.isEmpty() || sz <= 0 || str.length() < sz) {
            return "";
        }

        return IntStream.iterate(0, i -> i <= str.length() - sz, i -> i + sz)
                .mapToObj(i -> str.substring(i, i + sz))
                .map(StringBuilder::new)
                .map(chunk -> isSumOfCubesDivisibleByTwo(chunk) ?
                        chunk.reverse() :
                        chunk.substring(1) + chunk.charAt(0))
                .collect(Collectors.joining());
    }

    private static boolean isSumOfCubesDivisibleByTwo(StringBuilder chunk) {
        return chunk.chars()
                .map(c -> (int) Math.pow(c, 3))
                .sum() % 2 == 0;
    }
}
