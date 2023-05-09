package codewars.six;

import java.util.Arrays;

// Find The Parity Outlier: https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
public class FindOutlier {
    public static int find(int[] integers){
        int[] ints = Arrays.stream(integers).filter(x -> x% 2 == 0).toArray();
        return ints.length == 1 ? ints[0] : Arrays.stream(integers).filter(x -> x % 2 != 0).findFirst().getAsInt();
    }
}
