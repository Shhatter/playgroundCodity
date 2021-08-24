package src.codewars;

import java.util.Arrays;

public class SmallestIntegerInArray {


  public int solution(int[] insert) {
    int smallest = 1;

    while (true) {
      int finalSmallest = smallest;
      if (isaBoolean(insert, finalSmallest)) {
        return smallest;
      } else {
        smallest += 1;
      }

    }
  }

  public boolean isaBoolean(int[] insert, int finalSmallest) {
    return Arrays.stream(insert).noneMatch(value -> value == finalSmallest && value > 0);
  }
}
