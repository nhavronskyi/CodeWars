package codewars.seven;

public class SumOfCubes {
    public static long sumCubes(long n) {
        long sum = 0;

        for (; n >= 1; n--) {
            sum += n * n * n;
        }
        return sum;
    }
}
