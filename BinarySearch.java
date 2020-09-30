public class BinarySearch {
  public static int binarSearch(int[] list, int value) {
    int low = 0;
    int high = list.length - 1;

    while (low <= high) {
      int middle = (low + high) / 2;

      if (list[middle] == value)
        return middle;

      if (list[middle] > value) {
        high = middle - 1;
      }
      if (list[middle] < value) {
        low = middle + 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] list = { 2, 13, 24, 35, 46, 57, 68, 79, 80, 91, 102 };
    System.out.println(binarSearch(list, 13));
    System.out.println(binarSearch(list, 46));
    System.out.println(binarSearch(list, 103));
  }
}
