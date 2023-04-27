package codewars.six;

import java.util.ArrayList;
import java.util.List;

public class MultiplesOf3or5 {
    public static class Solution {

        public int solution(int number) {
            if(number < 3) return -1;

            List<Integer> list = new ArrayList<>();

            for(int i = 3; i < number; i++){
                    if(i%3 == 0 || i % 5 == 0) list.add(i);
            }

            return list.stream().mapToInt(Integer::intValue).sum();
        }
    }
}

