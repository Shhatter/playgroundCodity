package src.old_tsg;

public class Three {


  public static int solution(String word) {
    int sum = 0;
    for (int i = 0; i < word.length(); i++) {
      for (int j = i; j < word.length(); j++) {
        String sub = word.substring(i, j + 1);
        for (int y = 0; y < sub.length(); y++) {
          char c = sub.charAt(y);
          if (sub.chars().filter(ch -> ch == c).count() ==1 ) {
            sum += 1;
          }
        }


      }
    }
    return sum;
  }
}