package codewars.seven;

//https://www.codewars.com/kata/58712dfa5c538b6fc7000569/train/java
public class SimpleBeadsCount {
    public static int countRedBeads(final int nBlue) {
        return nBlue < 2 ? 0 : nBlue * 2 - 2;
    }
}
