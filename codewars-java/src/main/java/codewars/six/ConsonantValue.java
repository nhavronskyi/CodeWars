package codewars.six;

public class ConsonantValue {
    public static int solve(final String s) {
        int max = -1;
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum = isConsonant(c) ? sum + c - 96 : 0;

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

    private static boolean isConsonant(char c) {
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
    }
}
