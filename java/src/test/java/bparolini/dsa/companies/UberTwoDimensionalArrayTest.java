package bparolini.dsa.companies;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UberTwoDimensionalArrayTest {
  @Test
  public void testFindWord() {
    var testClass = new UberTwoDimensionalArray();
    assertTrue(testClass.findWord("", new String[2][]));
  }
}
