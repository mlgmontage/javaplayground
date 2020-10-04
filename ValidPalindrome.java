public class ValidPalindrome {
  public static void main(String[] args) {
    String palindrome = "A man, a plan, a canal: Panama";
    String trimmed = "";
    boolean output = true;

    int i, j;
    for (i = 0; i < palindrome.length(); i++) {

      if (Character.isLetterOrDigit(palindrome.charAt(i))) {
        trimmed += palindrome.charAt(i);
      }
    }

    trimmed = trimmed.toLowerCase();

    for (i = 0, j = trimmed.length() - 1; i < j; i++, j--) {
      if (trimmed.charAt(i) != trimmed.charAt(j)) {
        output = false;
      }
    }

    if (output) {
      System.out.println("Given string is palindrome");
    } else {

      System.out.println("Given string is palindrome");
    }
  }
}
