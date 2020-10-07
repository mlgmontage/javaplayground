public class ConsecutiveCharacters {
  static int maxPower(String s) {
    int i;
    char buff = Character.MAX_VALUE;
    int counter = 0, max = 0;

    for (i = 0; i < s.length(); i++) {
      if (s.charAt(i) == buff) {
        counter += 1;
      } else {
        buff = s.charAt(i);
        counter = 0;
      }
      max = Math.max(counter, max);
    }
    return max + 1;
  }

  public static void main(String[] args) {
    System.out.println(maxPower("eetcode"));
    System.out.println(maxPower("leetcode"));
    System.out.println(maxPower("leeeetcode"));
    System.out.println(maxPower("abbcccddddeeeeedcba"));
    System.out.println(maxPower("tourist"));

  }
}
