import java.util.*;

public class FrequencyCounter {

  public static void main(String[] args) {
    String sentence = "Hello world. My name is mlgmontage. Here is my code on java programming language";
    Map<Character, Integer> frequency = new HashMap<Character, Integer>();

    int i;
    for (i = 0; i < sentence.length(); i++) {
      if (frequency.containsKey(sentence.charAt(i))) {
        frequency.put(sentence.charAt(i), frequency.get(sentence.charAt(i)) + 1);
      } else {

        frequency.put(sentence.charAt(i), 1);
      }
    }

    frequency.forEach((k, v) -> System.out.println(k + " : " + v));
  }
}
