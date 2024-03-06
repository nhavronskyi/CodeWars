package codewars.seven;

// https://www.codewars.com/kata/580755730b5a77650500010c/train/java
public class OddEvenStringSort {
    public static String sortMyString(String s) {
        var chars = s.toCharArray();
        var even = new StringBuilder();
        var odd = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                even.append(chars[i]);
            } else {
                odd.append(chars[i]);
            }
        }
        return String.format("%s %s", even, odd);
    }
}
