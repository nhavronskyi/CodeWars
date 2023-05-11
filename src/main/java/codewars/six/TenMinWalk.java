package codewars.six;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;
        int strait = 0;
        int back = 0;

        for(char c : walk){
            if (c == 'n') strait++;
            else if (c == 'e') back++;
            else if (c == 's') strait--;
            else if (c == 'w') back--;
        }

        return strait == back;
    }
}
