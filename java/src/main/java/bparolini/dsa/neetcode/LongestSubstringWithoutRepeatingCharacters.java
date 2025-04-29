package bparolini.dsa.neetcode;

import java.util.Set;
import java.util.HashSet;

class LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {
    if (s == null) {
      return 0;
    }

    if (s.length() < 2) {
      return s.length();
    }

    int left = 0;
    int right = 0;
    int longest = 0;

    Set<Character> hash = new HashSet<>();

    while (right < s.length()) {
      char c = s.charAt(right);

      while (hash.contains(c)) {
        hash.remove(s.charAt(left++));
      }

      hash.add(c);
      longest = Math.max(longest, right++ - left + 1);
    }

    return longest;
  }
}
