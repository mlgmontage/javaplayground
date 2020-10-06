public class PrintAllSubArray2 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };

    int i, j, k;

    for (i = 0; i < arr.length; i++) {
      for (j = i; j < arr.length; j++) {
        System.out.print("[");
        for (k = i; k <= j; k++) {

          System.out.print(arr[k] + ", ");
        }
        System.out.print("]\n");
      }
    }
  }
}
