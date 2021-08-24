package src.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import src.codewars.SmallestIntegerInArray;

class SmallestIntegerInArrayTest {

  @Test
  void solution() {

    SmallestIntegerInArray smallestIntegerInArray = new SmallestIntegerInArray();

    assertEquals(4, smallestIntegerInArray.solution(new int[]{1, 2, 3}));

  }
}