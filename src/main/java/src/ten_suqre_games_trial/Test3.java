package src.ten_suqre_games_trial;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test3 {

    public int solution(int[] input) {
        var elems = Arrays.stream(input)
            .boxed()
            .sorted()
            .collect(Collectors.toList());

        int sum = 0;
        for (int i = 0; i < elems.size(); i++) {
            sum += Math.abs(elems.get(i) - (i + 1));
        }

        return sum;
    }
}
