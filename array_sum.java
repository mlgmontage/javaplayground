class ArraySum {
  public static void main(String[] args) {
    int[] arrow = { 1, 2, 3, 4 };
    int i, sum = 0;
    for (i = 0; i < arrow.length; i++) {
      sum += arrow[i];
    }

    System.out.println(sum);
  }
}