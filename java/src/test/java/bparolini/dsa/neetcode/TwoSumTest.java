package bparolini.dsa.neetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoSumTest {
  public void testCase1() {
    var testClass = new TwoSum();
    assertEquals(new int[] {0, 1},
                 testClass.twoSum(new int[] {2, 7, 11, 15}, 9));
  }

  public void testCase2() {
    var testClass = new TwoSum();
    assertEquals(new int[] {1, 2}, testClass.twoSum(new int[] {3, 2, 4}, 6));
  }

  public void testCase3() {
    var testClass = new TwoSum();
    assertEquals(new int[] {0, 1}, testClass.twoSum(new int[] {3, 3}, 6));
  }
}
