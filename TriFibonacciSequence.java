public class TriFibonacciSequence {
  static int triFib(int n) {
    if (n < 0 || n == 0 || n == 1)
      return 0;
    if (n == 2)
      return 1;
    return triFib(n - 1) + triFib(n - 2) + triFib(n - 3);

  }

  public static void main(String[] args) {
    int i;
    for (i = 0; i < 30; i++) {
      System.out.println(triFib(i));
    }
  }
}
