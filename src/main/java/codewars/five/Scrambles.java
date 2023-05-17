package codewars.five;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Scrambles {
    public static boolean scramble(String str1, String str2) {
        Map<String, Long> str1Map = Stream.of(str1.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        Map<String, Long> str2Map = Stream.of(str2.split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        return str2Map.entrySet().stream()
                .allMatch(s -> s.getValue() <= Optional.ofNullable(str1Map.get(s.getKey())).orElse(-1L));
    }
}
