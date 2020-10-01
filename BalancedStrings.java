/*
  Balanced strings are those who have equal quantity of 'L' and 'R' characters.

  Given a balanced string s split it in the maximum amount of balanced strings.

  Return the maximum amount of splitted balanced strings.
*/

public class BalancedStrings {
  public static void main(String[] args) {
    String balanced = "RLRRLLRLRL"; // 4

    int i, state = 0, counter = 0;

    for (i = 0; i < balanced.length(); i++) {
      if (state == 0)
        counter += 1;

      if (balanced.charAt(i) == 'L')
        state += 1;

      if (balanced.charAt(i) == 'R')
        state -= 1;
    }

    System.out.println("Maximum amount of splitted balanced strings: " + counter);
  }
}
