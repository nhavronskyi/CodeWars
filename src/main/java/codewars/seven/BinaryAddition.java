package codewars.seven;

public class BinaryAddition {
    public static class Kata {

        public static String binaryAddition(int a, int b) {
            int sum = a + b;
            StringBuilder stringBuilder = new StringBuilder();
            while (sum >= 1) {
                stringBuilder.append(sum % 2);
                sum /= 2;
            }
            return stringBuilder.reverse().toString();
        }
    }
}
