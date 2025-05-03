package bparolini.dsa.neetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContainerWithMostAreaTest {
  @Test
  public void testCase1() {
    var testClass = new ContainerWithMostArea();
    assertEquals(49, testClass.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
  }

  @Test
  public void testCase2() {
    var testClass = new ContainerWithMostArea();
    assertEquals(1, testClass.maxArea(new int[] {1, 1}));
  }
}
