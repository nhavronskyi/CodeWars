package codewars.six;

public class MultiplicationTable {

    public static int[][] multiplicationTable(int n) {
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }
        return arr;
    }
}
