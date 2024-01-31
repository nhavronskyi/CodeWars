package codewars.five;

public class RGBToHexConversion {
    public static String rgb(int r, int g, int b) {
        var res = toHex(r) + toHex(g) + toHex(b);
        return res.toUpperCase();
    }

    private static String toHex(int num) {
        num = num < 0 ? 0 : Math.min(num, 255);

        if (num == 0) {
            return "00";
        }

        var s = convertToHex(num);
        return s.length() == 1? 0 + s : s;
    }

    private static String convertToHex(int num) {
        if (num == 0) {
            return "";
        }

        int remainder = num % 16;
        char hex = (char) (remainder < 10 ? '0' + remainder : 'A' + remainder - 10);

        return convertToHex(num / 16) + hex;
    }
}
