/*
  We are given a list nums of integers representing a list compressed with run-length encoding.

  Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
  For each such pair, there are freq elements with value val concatenated in a sublist.
  Concatenate all the sublists from left to right to generate the decompressed list.

  Return the decompressed list.
*/

import java.util.List;
import java.util.ArrayList;

public class DecompressedArray {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };

    int i, j;
    List<Integer> decompressed = new ArrayList<Integer>();

    for (i = 0; i < nums.length; i += 2) {
      for (j = 0; j < nums[i]; j++) {
        decompressed.add(nums[i + 1]);
      }
    }

    for (i = 0; i < decompressed.size(); i++) {
      System.out.print(decompressed.get(i) + ", ");
    }
  }
}
