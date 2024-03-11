package codewars.seven;

public class AlternateCase {
    public static String alternateCase(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            c = Character.isLetter(c) ? (char) (Character.isLowerCase(c) ? c - 32 : c + 32) : c;
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
