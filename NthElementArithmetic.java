/*
  Return Nth element of arithmetic sequence where is the d is common difference.
  First term is always 1.
*/

public class NthElementArithmetic {

  static int nthElm(int n, int d) {
    int i, seq = 1;
    for (i = 0; i < n; i++) {
      seq += d;
    }

    return seq;
  }

  public static void main(String[] args) {
    int i;
    for (i = 0; i < 20; i++) {
      System.out.print(nthElm(i, 3) + "\n");
    }

  }
}
