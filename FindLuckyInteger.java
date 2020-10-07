/*
  Given an array of integers arr, a lucky integer is an integer which has a frequency in the array equal to its value.
  Return a lucky integer in the array. If there are multiple lucky integers return the largest of them. If there is no lucky integer return -1
*/

import java.util.*;

public class FindLuckyInteger {
  public int findLucky(int[] arr) {
    Arrays.sort(arr);

    Map<Integer, Integer> fr = new HashMap<Integer, Integer>();

    int i;
    for (i = 0; i < arr.length; i++) {
      if (fr.containsKey(arr[i])) {
        fr.put(arr[i], fr.get(arr[i]) + 1);
      } else {
        fr.put(arr[i], 1);
      }
    }

    for (i = arr.length - 1; i >= 0; i--) {
      if (fr.get(arr[i]) == arr[i]) {
        return arr[i];
      }
    }

    return -1;
  }
}
