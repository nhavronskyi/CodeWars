package codewars.seven;

// https://www.codewars.com/kata/563cf89eb4747c5fb100001b/train/java
public class RemoveTheMinimum {
    public static int[] removeSmallest(int[] numbers) {
        if (numbers.length == 0) {
            return numbers;
        }

        int minIndex = minIndex(numbers, 1, 0);

        int[] result = new int[numbers.length - 1];

        System.arraycopy(numbers, 0, result, 0, minIndex);

        System.arraycopy(numbers, minIndex + 1, result, minIndex, numbers.length - minIndex - 1);

        return result;
    }

    private static int minIndex(int[] numbers, int index, int minimum) {
        return index < numbers.length ?
                numbers[index] < numbers[minimum] ?
                        minIndex(numbers, index + 1, index) :
                        minIndex(numbers, index + 1, minimum) :
                minimum;
    }
}
