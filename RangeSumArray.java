public class RangeSumArray {

  static int rangeSum(int a, int b, int[] arr) {
    int i, sum = 0;
    for (i = a; i <= b; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4 };

    System.out.println(rangeSum(0, arr.length - 1, arr));
  }
}
