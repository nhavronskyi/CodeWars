package codewars.five;

public class GreedIsGood {
    public static int greedy(int[] dice) {
        int[] counts = new int[7];

        for (int value : dice) {
            counts[value]++;
        }

        int score = 0;

        for (int i = 1; i < counts.length; i++) {
            int triplet = i == 1 ? 1000 : i * 100;
            score += counts[i] / 3 * triplet;
        }

        score += counts[1] % 3 * 100;
        score += counts[5] % 3 * 50;

        return score;
    }
}
