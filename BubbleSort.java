public class BubbleSort {

  static void printList(int[] list) {
    int i;
    System.out.print("[");
    for (i = 0; i < list.length; i++) {
      System.out.print(list[i] + ", ");
    }
    System.out.print("]\n");
  }

  public static void main(String[] args) {
    int[] arrow = { 8, 1, 3, 8, 9, 12, 43, 29, 47, 78 };
    System.out.print("Before sorting: ");
    printList(arrow);

    int i, j;

    for (i = 0; i < arrow.length - 1; i++) {
      for (j = 0; j < arrow.length - i - 1; j++) {
        if (arrow[j] > arrow[j + 1]) {
          int temp = arrow[j];
          arrow[j] = arrow[j + 1];
          arrow[j + 1] = temp;
        }
      }
    }

    System.out.print("After sorting: ");
    printList(arrow);
  }
}
