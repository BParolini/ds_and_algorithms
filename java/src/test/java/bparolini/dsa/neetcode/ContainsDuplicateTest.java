package bparolini.dsa.neetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {
    @Test
    public void testCase1() {
        var testClass = new ContainsDuplicate();
        assertTrue(testClass.containsDuplicate(new int[] { 1, 2, 3, 1 }));
    }

    @Test
    public void testCase2() {
        var testClass = new ContainsDuplicate();
        assertFalse(testClass.containsDuplicate(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    public void testCase3() {
        var testClass = new ContainsDuplicate();
        assertTrue(
                testClass.containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));
    }
}
