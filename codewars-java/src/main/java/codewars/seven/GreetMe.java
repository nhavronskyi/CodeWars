package codewars.seven;

public class GreetMe {
    public static String greet(String name) {
        name = name.toLowerCase();
        var symbols = name.split("");
        return String.format("Hello %s!", name.replaceFirst(symbols[0], symbols[0].toUpperCase()));
    }
}
