package codewars.seven;

// https://www.codewars.com/kata/534d0a229345375d520006a0/train/java
public class PowerOfTwo {
    public static boolean isPowerOfTwo(long n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }

        return true;
    }
}
