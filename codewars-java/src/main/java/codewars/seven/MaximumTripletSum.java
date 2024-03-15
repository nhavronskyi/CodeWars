package codewars.seven;

import java.util.Arrays;

// https://www.codewars.com/kata/5aa1bcda373c2eb596000112/train/java
public class MaximumTripletSum {
    public static int maxTriSum(int[] numbers) {
        var arr = Arrays.stream(numbers)
                .sorted()
                .distinct()
                .toArray();
        int sum = 0;
        for (int i = arr.length - 3; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
