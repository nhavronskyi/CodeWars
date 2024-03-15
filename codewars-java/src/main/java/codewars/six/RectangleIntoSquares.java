package codewars.six;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RectangleIntoSquares {
    public static List<Integer> sqInRect(int lng, int width) {
        if (lng == width) {
            return null;
        }

        var squares = new ArrayList<Integer>();
        calculateSquares(lng, width, squares);

        return squares;
    }

    private static void calculateSquares(int lng, int width, List<Integer> squares) {
        if (lng == 0 || width == 0) {
            return;
        }

        int minSide = Math.min(lng, width);
        int numOfSquares = lng * width / (minSide * minSide);
        squares.addAll(Collections.nCopies(numOfSquares, minSide));

        if (lng > width) {
            calculateSquares(lng % width, width, squares);
        } else {
            calculateSquares(lng, width % lng, squares);
        }
    }
}
