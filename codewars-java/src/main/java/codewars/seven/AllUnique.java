package codewars.seven;

import java.util.stream.Collectors;

// https://www.codewars.com/kata/553e8b195b853c6db4000048/train/java
public class AllUnique {
    public static boolean hasUniqueChars(String str) {
        return str.chars()
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .values()
                .stream().allMatch(x -> x == 1);
    }
}
