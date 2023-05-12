package codewars.six;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        return  Stream.of(text.split(""))
                .filter( s ->Stream.of(text.split(""))
                        .filter(x -> x.equals(s))
                        .count() > 1)
                .collect(Collectors.toSet()).size();
    }
}
