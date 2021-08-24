package src.codewars;


class LongestPalindrome {

  public static int longestPalindrome(final String s) {
    int longest = 0;
    if (s.length() == 0) {
      return longest;
    }
    for (int i = 0; i < s.length(); i++) {

      for (int j = i; j < s.length(); j++) {

        StringBuilder sub = new StringBuilder(s.substring(i, j + 1));
        if (sub.toString().equals(sub.reverse().toString()) && sub.length() > longest) {
          longest = sub.length();
        }

      }
    }

    return longest;
  }
}