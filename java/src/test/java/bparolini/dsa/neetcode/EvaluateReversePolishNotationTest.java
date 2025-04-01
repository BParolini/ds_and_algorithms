package bparolini.dsa.neetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EvaluateReversePolishNotationTest {
  @Test
  public void testCalculate() {
    var testClass = new EvaluateReversePolishNotation();
    assertEquals(0l, testClass.calculate());
  }
}
