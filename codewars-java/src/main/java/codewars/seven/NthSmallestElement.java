package codewars.seven;

import java.util.Arrays;

public class NthSmallestElement {
    public static int nthSmallest(final int[] arr, final int n) {
        return Arrays.stream(arr).sorted().toArray()[n - 1];
    }
}
