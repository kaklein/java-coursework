//Katie Klein
//CSD 320
//9 April 2021
//Assignment 5 - While Loop

/*
This program uses a while loop to print the sum of many fractions
whose denominators increment (first case) or decrement (second case) by
two with each iteration.
*/

package klein.mod5;

public class FractionSum {
    public static void main(String[] args) {
        //First operation
        double i = 3.0;
        double firstSum = 0.0;
        while (i < 99.0) {
            System.out.printf("1/%.0f + ", i);
            //perform sum
            firstSum += 1 / i;
            i += 2;
        }
        //print final number & do final sum for first operation
        System.out.printf("1/%.0f", i);
        firstSum += 1 / i;
        //print first sum
        System.out.println("\nFirst sum is " + firstSum + "\n");
    
        //Second operation
        i = 99.0;
        double secondSum = 0.0;
        while (i > 3.0) {
            System.out.printf("1/%.0f + ", i);
            //perform sum
            secondSum += 1 / i;
            i -= 2;
        }
        //print final number & do final sum for second operation
        System.out.printf("1/%.0f", i);
        secondSum += 1 / i;
        //print second sum
        System.out.println("\nSecond sum is " + secondSum);    
    }
    
}
