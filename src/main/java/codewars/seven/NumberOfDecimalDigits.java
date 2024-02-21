package codewars.seven;

public class NumberOfDecimalDigits {
    public static int Digits(long n) {
        int sum = 0;

        while (n > 0) {
            n /= 10;
            sum++;
        }

        return sum == 0 ? 1 : sum;
    }
}
