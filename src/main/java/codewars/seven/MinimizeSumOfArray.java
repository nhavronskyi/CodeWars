package codewars.seven;

// https://www.codewars.com/kata/5a523566b3bfa84c2e00010b/train/java
public class MinimizeSumOfArray {
    public static int minSum(int[] passed) {
        sort(passed);

        int sum = 0;
        for (int i = 0; i < passed.length / 2; i++) {
            sum += passed[i] * passed[passed.length - 1 - i];
        }

        return sum;
    }

    private static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;

            for (; j >= 0 && nums[j] > key; j--) {
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = key;
        }
    }
}
