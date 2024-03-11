package codewars.seven;

public class SimpleStringCharacters {
    public static int[] symbolsCalculator(String word) {
        int[] arr = new int[4];
        for (char c : word.toCharArray()) {
            switch (Character.getType(c)) {
                case Character.UPPERCASE_LETTER -> arr[0]++;
                case Character.LOWERCASE_LETTER -> arr[1]++;
                case Character.DECIMAL_DIGIT_NUMBER -> arr[2]++;
                default -> arr[3]++;
            }
        }
        return arr;
    }
}
