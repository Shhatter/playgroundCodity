package src.zadania_vodeno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) {

        System.out.println(letterCount("ala maaaaaaa ko texs"));

    }

    public static String letterCount(String str) {
        var list = Arrays.asList(str.split(" "));

        var index = 0;
        var maxSize = 0;
        for (int i = 0; i < list.size(); i++) {
            var output = new ArrayList<>(Stream.of(list.get(i))
                .flatMap(a -> a.chars().mapToObj(c -> (char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).values());
            var max = output.stream().mapToInt(Long::intValue).max().orElse(0);

            if (max > maxSize) {
                index = i;
                maxSize = max;
            }
        }
        return list.get(index);
    }

}

