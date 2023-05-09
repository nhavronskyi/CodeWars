package codewars.six;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateEncoder {
    public static String encode(String word){
        return Stream.of(word.toLowerCase().split(""))
                .map(x -> word.toLowerCase().lastIndexOf(x) == word.toLowerCase().indexOf(x) ? "(" : ")")
                .collect(Collectors.joining());
    }
}
