/*
  Sum all possible triplets in array.

  input: [1, 2, 3, 4]
  output: 15
  explanation: [1, 2, 3], [2, 3, 4] -> 1+2+3 + 2+3+4 = 6+9 = 15
*/

public class SumTriplets {
  public static void main(String[] args) {
    int[] sample = { 1, 2, 3, 4 };

    int i, sum = 0;

    for (i = 0; i < sample.length - 2; i++) {
      sum += sample[i];
      sum += sample[i + 1];
      sum += sample[i + 2];
    }

    System.out.println("Sum of all triplets in array : " + sum);
  }
}
