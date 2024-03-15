package codewars.six;

// Persistent Bugger. https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java
public class Persist {
    public static int persistence(long n) {
        long sum = 1;
        int counter = 0;
        while (n / 10 >= 1) {
            while (n >= 1) {
                sum *= n % 10;
                n /= 10;
            }
            n = sum;
            sum = 1;
            counter++;
        }
        return counter; // your code
    }
}
