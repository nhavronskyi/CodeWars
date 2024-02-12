package codewars.six;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        var t = text.toUpperCase();
        return Stream.of(t.split(""))
                .filter(s -> t.indexOf(s) != t.lastIndexOf(s))
                .collect(Collectors.toSet())
                .size();
    }
}
