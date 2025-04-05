package bparolini.dsa.neetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> hash = new HashMap<>();

    Integer hashItem;
    for (int i = 0; i < nums.length; i++) {
      hashItem = hash.get(target - nums[i]);
      if (hashItem != null) {
        return new int[] {hashItem, i};
      }

      hash.put(nums[i], i);
    }

    return new int[2];
  }
}
