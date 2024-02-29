package codewars.seven;

public class FilterTheNumber {
    public static long filterString(final String value) {
        var numString = value.chars()
                .boxed()
                .map(x -> (char) x.intValue())
                .filter(FilterTheNumber::isALetter)
                .map(Object::toString)
                .reduce("", (a, b) -> a + b);
        return Long.parseLong(numString);
    }

    private static boolean isALetter(char symbol) {
        try {
            Integer.parseInt(String.valueOf(symbol));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
