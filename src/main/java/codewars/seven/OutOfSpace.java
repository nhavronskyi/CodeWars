package codewars.seven;

public class OutOfSpace {

    // link -> https://www.codewars.com/kata/56576f82ab83ee8268000059
    public static String[] spacey(String[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + array[i];
        }
        return array;
    }

}