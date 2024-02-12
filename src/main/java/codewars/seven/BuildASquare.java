package codewars.seven;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BuildASquare {
    public static String generateShape(int n) {
        return IntStream.range(0, n)
                .mapToObj(i -> "+".repeat(n) + "\n")
                .collect(Collectors.joining())
                .trim();
    }
}
