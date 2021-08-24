package src.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemovedNumbers {

  public static List<long[]> removNb(long n) {
    ArrayList<Long> nums = genNums(n);
    List<long[]> out = new ArrayList<>();

    long sum = n*(n+1)/2 ;
    for (int i = 0; i < n; i++) {
      long a = (sum - nums.get(i)) / (nums.get(i) + 1);
      if (nums.get(i) != a && ((a * nums.get(i)) == (sum - a - nums.get(i)))  && a <=n ) {
        out.add(new long[]{nums.get(i), a});
      }
    }
    return out;
  }

  private static ArrayList<Long> genNums(long n) {
    long a = 1;
    ArrayList<Long> out = new ArrayList<>();
    while (a <= n) {
      out.add(a);
      a++;
    }
    return out;
  }
}

/*
package src.tenSquareGames;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

public class One {


  public static int solution(String word) {
    List<Integer> occurrences = new ArrayList<>();
    int shortest = 300;
    int size = word.length() ;

    if (word == null || word.length() == 0) {
      return 0;
    }


    for (int i = 0; i < word.length(); i++) {
      for (int j = i; j < word.length(); j++) {

        String sub = word.substring(i, j + 1);
        if (sub.length() > 1) {
          Pattern pattern = Pattern.compile(sub,Pattern.LITERAL);
          int out =  countMatches(pattern,sub) ;

          Matcher matcher = pattern.matcher(word);
          int count = 0;
          while (matcher.find()) {
            count += 1;
          }
          if (count < shortest) {
            shortest = count;
            size = sub.length() ;
          }
        }
      }
    }
    return size;
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

  static int countMatches(Pattern pattern, String string)
  {
    Matcher matcher = pattern.matcher(string);

    int count = 0;
    int pos = 0;
    while (matcher.find(pos))
    {
      count++;
      pos = matcher.start() + 1;
    }

    return count;
  }*/

//}
