public class printAllSubArrays {
  public static void main(String[] args) {
    int[] arrow = { 1, 2, 3, 4, 5, 6, 7 };

    int i, j, k;

    // this loop give incremental subarray
    for (i = 1; i <= arrow.length; i++) {

      for (j = 0; j <= arrow.length - i; j++) {

        System.out.print("[");
        for (k = 0; k < i; k++) {

          System.out.print(arrow[j + k] + ", "); // one-by-one

        }
        System.out.print("]\n");
      }
    }
  }
}
