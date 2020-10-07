/*
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
*/

public class MaxConsecutive {
  static int findMaxConsecutiveOnes(int[] nums) {
    int i, counter = 0, max = 0;

    for (i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        counter += 1;
      } else {
        counter = 0;
      }
      max = Math.max(max, counter);
    }
    return max;

  }

  public static void main(String[] args) {
    int[] nums = { 1, 1, 0, 1, 1, 1 };
    System.out.println(findMaxConsecutiveOnes(nums));
  }
}
