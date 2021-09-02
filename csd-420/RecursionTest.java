/* Katie Klein
 * CSD 420
 * 17 August 2021
 * Assignment 2: Recursion
 */

/*
This program uses a recursive method to return a sum in the following pattern:
    getFractionSum(i) = 1/2 + 2/3 + 3/4 + 4/5 + 5/6 … i/(i + 1)
*/

public class RecursionTest {
    public static void main (String[] args) {
        // test method with three different inputs
        int testInt1 = 5;
        int testInt2 = 10;
        int testInt3 = 22;

        System.out.println("-- TESTING RECURSIVE METHOD --\n");
        System.out.println("getFractionSum(" + testInt1 + "):\t" + getFractionSum(testInt1));
        System.out.println("getFractionSum(" + testInt2 + "):\t" + getFractionSum(testInt2));
        System.out.println("getFractionSum(" + testInt3 + "):\t" + getFractionSum(testInt3));
    }

    // recursive method to return sum of 1/2 + 2/3 + 3/4 ... i/(i+1)
    static double getFractionSum(int i) {
        if(i == 1) { // base case
            return (1.0 / 2.0);
        }
        else {
            return ((double)(i) / ((double)(i) + 1)) + getFractionSum(i - 1);
        }
    }
}