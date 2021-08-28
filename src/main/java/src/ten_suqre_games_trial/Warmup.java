package src.ten_suqre_games_trial;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Warmup {

    public int solution(int[] input) {

        var array = Arrays.stream(input).parallel()
            .sorted()
            .boxed()
            .filter(value -> value > 0)
            .collect(Collectors.toList());

        if (array.isEmpty()) {
            return 1;
        }
        return IntStream.rangeClosed(1, array.size() + 1)
            .boxed()
            .filter(integer -> !array.contains(integer))
            .findFirst()
            .orElseThrow(IllegalArgumentException::new);
    }


    public int solutionOld(int[] input) {

        var array = Arrays.stream(input)
            .sorted()
            .boxed()
            .filter(value -> value > 0)
            .collect(Collectors.toList());
        if (array.isEmpty()) {
            return 1;
        }
        return IntStream.rangeClosed(1, array.size() + 1)
            .boxed()
            .filter(integer -> !array.contains(integer))
            .findFirst()
            .orElseThrow(IllegalArgumentException::new);
    }
}
