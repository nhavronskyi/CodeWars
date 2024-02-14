package codewars.seven;

public class Factorial {
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n <= 2 ? n : n * factorial(n - 1);
    }
}
