package bparolini.dsa.neetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> item = new HashSet<Integer>();

        for (int num : nums) {
            if (item.contains(num)) {
                return true;
            }

            item.add(num);
        }

        return false;
    }
}
