import java.util.List;
import java.util.ArrayList;

/*
  Classic FizzBuzz problem.
*/

public class FizzBuzz {
  public static List<String> fizzBuzz(int n) {
    List<String> output = new ArrayList<String>();

    int i;
    for (i = 1; i <= n; i++) {
      if (i % 15 == 0) {
        output.add("FizzBuzz");
        continue;
      }
      if (i % 3 == 0) {
        output.add("Fizz");
        continue;
      }
      if (i % 5 == 0) {
        output.add("Buzz");
        continue;
      }
      output.add(Integer.toString(i));
    }
    return output;
  }

  public static void main(String[] args) {
    List<String> output = fizzBuzz(100);

    for (String s : output) {
      System.out.println(s);
    }
  }
}
