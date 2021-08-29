package src.ten_suqre_games_trial;

import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

    public int solution(int input) {

        if (input > 500 || input <= 0) {
            throw new IllegalArgumentException("illegal argument ! ");
        }

        var digits = getDigits(input);
        var multipliedSum = getSum(digits) * 2;

        var currentSumNumber = input + 1;
        while (currentSumNumber < Integer.MAX_VALUE) {

            var potentialDigits = getDigits(currentSumNumber);
            if (getSum(potentialDigits) == multipliedSum) {
                return currentSumNumber;
            } else {
                currentSumNumber++;
            }
        }
        return -1;
    }

    private List<Integer> getDigits(int input) {
        return String.valueOf(input).chars()
            .mapToObj(i -> (char) i)
            .map(character -> character - '0')
            .collect(Collectors.toList());
    }

    private int getSum(List<Integer> digits) {
        return digits.stream().mapToInt(Integer::intValue).sum();
    }
}
