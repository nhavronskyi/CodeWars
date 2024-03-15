package codewars.seven;

public class Switcheroo {
    public static String switcheroo(String x) {
        return x.replace("a", "t")
                .replace("b", "a")
                .replace("t", "b");
    }
}
