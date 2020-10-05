public class WordByWord {
  public static void main(String[] args) {
    String words = "Hello world word balance print";

    int i;
    for (i = 0; i < words.length(); i++) {
      if (words.charAt(i) != ' ') {
        System.out.print(words.charAt(i));
        continue;
      } else {

        System.out.print("\n");
      }
    }
  }
}
