package bparolini.dsa.neetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {
  @Test
  public void testCase1() {
    var testClass = new LongestSubstringWithoutRepeatingCharacters();
    assertEquals(3, testClass.lengthOfLongestSubstring("abcabcbb"));
  }

  @Test
  public void testCase2() {
    var testClass = new LongestSubstringWithoutRepeatingCharacters();
    assertEquals(1, testClass.lengthOfLongestSubstring("bbbbb"));
  }

  @Test
  public void testCase3() {
    var testClass = new LongestSubstringWithoutRepeatingCharacters();
    assertEquals(3, testClass.lengthOfLongestSubstring("pwwkew"));
  }
}
