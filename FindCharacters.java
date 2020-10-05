import java.util.*;

public class FindCharacters {

  static List<Integer> findCharacter(String sentence, char ch) {
    List<Integer> result = new ArrayList<Integer>();

    int i;
    for (i = 0; i < sentence.length(); i++) {
      if (sentence.charAt(i) == ch) {
        result.add(i);
      }
    }

    return result;
  }

  public static void main(String[] args) {
    String words = "Hello world word balance print";
    List<Integer> result = findCharacter(words, 'o');

    for (int i : result) {
      System.out.println(i);
    }
  }
}
