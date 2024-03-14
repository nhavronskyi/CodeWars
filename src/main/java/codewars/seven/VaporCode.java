package codewars.seven;

import java.util.stream.Collectors;

public class VaporCode {
    public static String vaporCode(String str) {
        return str.chars()
                .boxed()
                .map(c -> (char) c.intValue())
                .map(String::valueOf)
                .filter(s -> !s.equals(" "))
                .map(String::toUpperCase)
                .collect(Collectors.joining("  "));
    }
}
