package codewars.seven;

//https://www.codewars.com/kata/586f6741c66d18c22800010a/train/java
public class SumOfASequence {
    public static int sequenceSum(int start, int end, int step) {
        if (start > end) {
            return 0;
        }

        int result = 0;
        int current = start;

        while (current <= end) {
            result += current;
            current += step;
        }

        return result;
    }
}
