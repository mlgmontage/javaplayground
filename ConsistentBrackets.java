public class ConsistentBrackets {

  static boolean isConsistent(String brackets) {
    int i, state = 0;
    for (i = 0; i < brackets.length(); i++) {

      if (brackets.charAt(i) == '[' || brackets.charAt(i) == ']') {

        if (brackets.charAt(i) == '[') {
          state += 1;
        }

        if (brackets.charAt(i) == ']') {
          state -= 1;
        }
      } else {
        return false;
      }
    }

    return state == 0 ? true : false;
  }

  public static void main(String[] args) {
    String sample1 = "[][][]"; // true
    String sample2 = "[][]["; // false
    String sample3 = "[[[]]]"; // true
    String sample4 = "[[[a]]]"; // false

    System.out.println(isConsistent(sample1));
    System.out.println(isConsistent(sample2));
    System.out.println(isConsistent(sample3));
    System.out.println(isConsistent(sample4));
  }
}
