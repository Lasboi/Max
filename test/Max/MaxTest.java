package Max;

import junit.framework.TestCase;

public class MaxTest extends TestCase {

    /*
        Test Cases

        Input: a = 4, b = 6
        Forventet output: 6

        Input: a = 4, b = 7
        Forventet output: 7

        Input: a = 10, b = 3
        Forventet output: 10
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

    public void testMaxOf4And7Equals7() {

        // Input
        int a = 4;
        int b = 7;

        //Execution
        int result = Calculator.max(a, b);

        // Asserts
        assertEquals(7, result);
    }

    public void testMaxOf10And3Equals3() {

        // Input
        int a = 10;
        int b = 3;

        //Execution
        int result = Calculator.max(a, b);

        // Asserts
        assertEquals(10, result);
    }

}