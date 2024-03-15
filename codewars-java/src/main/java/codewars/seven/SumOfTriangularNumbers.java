package codewars.seven;

public class SumOfTriangularNumbers {
    public static int sumTriangularNumbers(int n) {
        int sum = 0;

        for (int i = 0, counter = 1; i < n; i++) {
            for (int j = 0; j <= i; j++, counter++) {
                if (j == i) {
                    sum += counter;
                }
            }
        }
        return sum;
    }
}
