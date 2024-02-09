package codewars.six;

import org.junit.jupiter.api.Test;

import static codewars.six.MultiplesOf3or5.Solution;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplesOf3or5Test {
    @Test
    public void test() {
        assertEquals(23, new Solution().solution(10));
    }
}