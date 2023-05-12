package codewars.six;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        return Stream.of(text.split(""))
                .filter(s -> text.indexOf(s) != text.lastIndexOf(s))
                .collect(Collectors.toSet())
                .size();
    }
}
