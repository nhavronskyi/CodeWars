package codewars.six;

import java.util.Map;
import java.util.stream.Collectors;

public class CountCharactersInYourString {
    public static Map<Character, Integer> count(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, v -> v.getValue().intValue()));
    }
}
