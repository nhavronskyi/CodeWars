package codewars.six;

// Find The Parity Outlier: https://www.codewars.com/kata/5526fc09a1bbd946250002dc/train/java
public class FindOutlier {
    public static int find(int[] integers){
        int even = 0;
        int lastEven = 0;
        int odd = 0;
        int lastOdd = 0;
        for (int i = 0; i < integers.length; i++) {
            if(integers[i] % 2 == 0) {
                even++;
                lastEven = integers[i];
            }
            else {
                odd++;
                lastOdd = integers[i];
            }
        }
        return even > odd ? lastOdd : lastEven;
    }
}
