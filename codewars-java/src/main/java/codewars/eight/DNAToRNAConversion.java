package codewars.eight;

// https://www.codewars.com/kata/5556282156230d0e5e000089/train/java
public class DNAToRNAConversion {
    // of course, I can use String.replace, but it's too boring😁
    public static String dnaToRna(String dna) {
        return replace(dna);
    }

    private static String replace(String text) {
        StringBuilder builder = new StringBuilder();
        var arr = text.toCharArray();
        for (char c : arr) {
            builder.append(c == 'T' ? 'U' : c);
        }

        return builder.toString();
    }
}
