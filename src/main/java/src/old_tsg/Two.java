package src.old_tsg;

public class Two {


  public static int solution(int[] arr) {

    int output = 0;

    for (int i = 0; i < arr.length; i++) {
      int count = 0;

      for (int j = 0; j < arr.length; j++) {

        if (arr[j] == arr[i]) {
          count++;
        }
      }
      if (count > output && count == arr[i]) {
        output = count;
      }
    }
    return output;
  }
}
