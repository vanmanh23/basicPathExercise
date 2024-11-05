package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArrayUtilsTest {

    // Test Case for Path 1: No values in range, expects -999
    @Test
    public void testNoValidNumbers() {
        int[] values = {-999, -10, -20};
        assertEquals(-999, ArrayUtils.average(values, 0, 3));
    }

    // Test Case for Path 2: Some values processed, but none within range
    @Test
    public void testValuesOutsideRange() {
        int[] values = {15, 25, 35, -999};
        assertEquals(-999, ArrayUtils.average(values, 1, 10));
    }

    // Test Case for Path 3: Valid values in range, calculates average
    @Test
    public void testValidNumbersInRange() {
        int[] values = {4, 6, 9, -999};
        assertEquals(6, ArrayUtils.average(values, 4, 10));
    }

    // Test Case for Path 4: Loop termination at 100th element
    @Test
    public void testLoopTerminationAtMaxInputNumber() {
        int[] values = new int[101];
        for (int i = 0; i < 100; i++) {
            values[i] = 3; // Within range
        }
        values[100] = -999;
        assertEquals(3, ArrayUtils.average(values, 1, 5));
    }

    // Additional Test Case: All values are below the range, expects -999
    @Test
    public void testAllValuesBelowRange() {
        int[] values = {1, 2, 3, -999};
        assertEquals(-999, ArrayUtils.average(values, 5, 10));
    }

    // Additional Test Case: Some values within a new range, expects average of those values
    @Test
    public void testNewRangeWithValidValues() {
        int[] values = {7, 8, 10, -999};
        assertEquals(8, ArrayUtils.average(values, 7, 10));
    }
}
