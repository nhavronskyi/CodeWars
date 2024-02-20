package codewars.six;

// https://www.codewars.com/kata/52de553ebb55d1fca3000371/train/java
public class MissingTermInAnArithmeticProgression {
    public static int findMissing(int[] numbers) {
        int diffNumber = numbers[1] - numbers[0];

        for (int i = 2; i < numbers.length; i++) {
            int act = numbers[i];
            int prev = numbers[i - 1];
            if (act == prev || prev + diffNumber != act) {
                return act - diffNumber;
            }
        }
        return 0;
    }
}
