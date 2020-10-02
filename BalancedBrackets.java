import java.util.Stack;

public class BalancedBrackets {

  public static boolean isBalanced(String brackets) {
    Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < brackets.length(); i++) {
      if (brackets.charAt(i) == '(' || brackets.charAt(i) == '[' || brackets.charAt(i) == '{') {
        stack.push(brackets.charAt(i));
      } else {
        if (stack.isEmpty())
          return false;

        char pop = stack.pop();
        if (pop == '(' && brackets.charAt(i) != ')')
          return false;
        if (pop == '[' && brackets.charAt(i) != ']')
          return false;
        if (pop == '{' && brackets.charAt(i) != '}')
          return false;
      }
    }
    if (!stack.isEmpty())
      return false;
    return true;
  }

  public static void main(String[] args) {
    String b1 = "()()()";
    String b2 = "[]{}[[]]";
    String b3 = "(()()";
    String b4 = "()()()}";

    System.out.println(isBalanced(b1));
    System.out.println(isBalanced(b2));
    System.out.println(isBalanced(b3));
    System.out.println(isBalanced(b4));
  }
}
