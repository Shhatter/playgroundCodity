package src.tenSquareGames;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class One {

    public static int solution(String word) {
        List<Integer> occurrences = new ArrayList<>();
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

    public static void getCount(String word, List<Integer> occurrences, int i, int j) {
        Pattern pattern = Pattern.compile(word.substring(i, j + 1));
        Matcher matcher = pattern.matcher(word);
        int count = 0;
        while (matcher.find()) {
            count += 1;
        }
        occurrences.add(count);
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
