package src.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecretFromRandomTriplets {

//    https://www.codewars.com/kata/53f40dff5f9d31b813000774/train/java

    public String recoverSecret(char[][] triplets) {

        var characterSet = Arrays.stream(triplets).map(String::new)
            .flatMap(x -> x.chars().mapToObj(i -> (char) i))
            .map(Object::toString).distinct().collect(Collectors.toCollection(ArrayList::new));
        var stringList = Arrays.stream(triplets).map(String::new).collect(Collectors.toList());

        StringBuilder answer = new StringBuilder();

        while (!characterSet.isEmpty()) {

            stringList = iterateOnNotUsedLetters(characterSet, stringList, answer);
        }

        return answer.toString();
    }

    private List<String> iterateOnNotUsedLetters(ArrayList<String> characterSet, List<String> stringList, StringBuilder answer) {
        for (int i = 0 ; i < characterSet.size();i++) {
            var val = characterSet.get(i) ;

            if (checkIfMostLeftLetter(stringList, val)) {
                answer.append(val);
                characterSet.remove(val);
                stringList = stringList.stream().map(s -> s.replace(val, ""))
                    .collect(Collectors.toList());
            }
        }
        return stringList;
    }

    private boolean checkIfMostLeftLetter(List<String> stringList, String val) {
        return stringList.parallelStream()
            .filter(s -> s.contains(val))
            .allMatch(x -> String.valueOf(x.charAt(0)).equals(val));
    }

}


/*
         var valueMap = characterList.stream().collect(Collectors.toMap(key -> key,
            o -> 0,
            Integer::sum,
            LinkedHashMap::new));


 for (int i = 0; i < characterList.size(); i++) {
            if (i % 3 == 0) {
                valueMap.computeIfPresent(characterList.get(i), (character, integer) -> integer += 0);
            } else if (i % 3 == 1) {
                valueMap.computeIfPresent(characterList.get(i), (character, integer) -> integer += 1);
            } else {
                valueMap.computeIfPresent(characterList.get(i), (character, integer) -> integer += 2);
            }

        }*/