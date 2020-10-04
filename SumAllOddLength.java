public class SumAllOddLength {
  public static void main(String[] args) {
    int[] arrow = { 1, 4, 2, 5, 3 };

    int i, j, k, sum = 0;

    // this loop give incremental subarray
    for (i = 1; i <= arrow.length; i += 2) {

      for (j = 0; j <= arrow.length - i; j++) {

        for (k = 0; k < i; k++) {

          sum += arrow[j + k];

        }
      }
    }
    System.out.println("Sum of all odd lenght subarrays : " + sum);
  }
}
