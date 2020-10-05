public class FibonacciSequence {

  static int fibonacci(int n) {
    if (n == 0)
      return 0;
    if (n == 1)
      return 1;

    int a = 0, b = 1;
    int i = 0;

    while (i < n) {

      int temp = a;
      a = b;
      b = temp + b;
      i += 1;
    }
    return b;

  }

  public static void main(String[] args) {

    int i;
    for (i = 0; i < 10; i++) {
      System.out.print(fibonacci(i) + "\n");
    }
  }
}
