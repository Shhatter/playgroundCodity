package src.old_tsg;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class One {

    public static int updatedSolution(String word) {

        return generateAllPossibilities(word).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
            .filter(x -> x.getValue().intValue() == 1).findFirst()
            .orElseThrow(IllegalArgumentException::new).getKey().length();

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

    public static int solution(String word) {
        int shortest = 300;

        if (word == null || word.length() == 0) {
            return 0;
        }
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {

                String sub = word.substring(i, j + 1);
                if (sub.length() > 1) {
                    Pattern pattern = Pattern.compile(sub, Pattern.LITERAL);
                    Matcher matcher = pattern.matcher(word);
                    int count = 0;
                    while (matcher.find()) {
                        count += 1;
                    }
                    if (count < shortest) {
                        shortest = count;
                    }
                }
            }
        }
        return shortest;
    }

    static int countFreq(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        int res = 0;

        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) {
            /* For current index i, check for
        pattern match */
            int j;
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

            // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
            if (j == M) {
                res++;
                j = 0;
            }
        }
        return res;
    }

    /* Driver program to test above function */
    static public void main(String[] args) {
        String txt = "dhimanman";
        String pat = "man";
        System.out.println(countFreq(pat, txt));
    }

}

/*
https://www.geeksforgeeks.org/smallest-substring-occurring-only-once-in-a-given-string/
    Given a string S consisting of N lowercase alphabets, the task is to find the length of the smallest substring in S whose occurrence is exactly 1.

    Examples:

    Input: S = “abaaba”
    Output: 2
    Explanation:
    The smallest substring in the string S, whose occurrence is exactly 1 is “aa” . Length of this substring is 2.
    Therefore, print 2.
/
    Input: S = “zyzyzyz”
    Output: 5*/
