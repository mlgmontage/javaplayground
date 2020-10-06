/*
  Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
  Output: 6
  Explanation: [4,-1,2,1] has the largest sum = 6.
*/

public class MaximumSubarraySum {
  public static void main(String[] args) {
    int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    int i, k, j, sum = 0, best = 0;

    for (i = 0; i < arr.length; i++) {
      for (j = i; j < arr.length; j++) {
        sum = 0;
        for (k = i; k <= j; k++) {
          sum += arr[k];
        }
        best = Math.max(sum, best);
      }

    }

    System.out.println(best + "\n");
  }
}
