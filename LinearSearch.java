public class LinearSearch {
  public static int linearSearch(int[] list, int value) {
    int i;
    for (i = 0; i < list.length; i++) {
      if (list[i] == value) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] list = { 2, 17, 21, 39, 45, 57 };

    System.out.println(linearSearch(list, 45));
    System.out.println(linearSearch(list, 105));
  }
}
