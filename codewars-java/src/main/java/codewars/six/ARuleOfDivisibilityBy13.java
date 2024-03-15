package codewars.six;

public class ARuleOfDivisibilityBy13 {
    private static final int[] arr = new int[]{1, 10, 9, 12, 3, 4};

    public static long thirt(long n) {
        while (n >= 100) {
            n = sumOfTransformedNumbers(n);
        }
        return n;
    }

    private static long sumOfTransformedNumbers(long n) {
        long sum = 0;
        for (int i = 0; n > 0; i++, n /= 10) {
            sum += n % 10 * arr[i % 6];
        }
        return sum;
    }
}
