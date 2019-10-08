package Max;

import junit.framework.TestCase;

public class MaxTest extends TestCase {

    /*
        Test Case
        Input: a = 4, b = 6
        Forventet output: 6
     */

    public void testMaxOf4And6Equals6() {
        // Input
        int a = 4;
        int b = 6;

        // Execution
        int result = Calculator.max(a, b);

        // Asserts
        assertEquals(6, result);
    }

}