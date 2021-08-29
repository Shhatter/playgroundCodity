package src.ten_suqre_games_trial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

    public int solution(String input) {

        var possibilities = generateAllPossibilities(input).stream().sorted(Comparator.comparingInt(String::length))
            .collect(Collectors.toList());

        var output = possibilities.stream()
            .filter(Test2::extracted)
            .findFirst();

        return output.map(String::length).orElse(-1);
    }

    private static boolean extracted(String s) {
        var chars = s.chars().mapToObj(i -> (char) i).collect(Collectors.toList());
        return chars.stream().allMatch(character ->
            s.contains(character.toString().toUpperCase()) && s.contains(character.toString().toLowerCase()));
    }

    private static List<String> generateAllPossibilities(String word) {

        var result = new ArrayList<String>();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {

                var str = word.substring(i, j);
                if (str.length() >= 2) {
                    result.add(str);
                }

            }
        }
        return result;
    }

}
